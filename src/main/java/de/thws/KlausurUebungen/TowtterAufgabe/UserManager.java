package de.thws.KlausurUebungen.TowtterAufgabe;

import java.io.*;
import java.util.List;

public class UserManager implements ObjectManager<User>{


    @Override
    public void serialize(List<User> users){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.dat"))){
            oos.writeObject(users);
        } catch (FileNotFoundException fnfe){
          throw new RuntimeException("Datei wurde nicht gefunden!");
        } catch (IOException ioe){
            throw new RuntimeException("Es gab ein Problem mit einem User!" + ioe);
        }
    }

    @Override
    public List<User> deserialize(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.dat"))){
            List<User> u = (List<User>) ois.readObject();
            return u;
        } catch (ClassNotFoundException | IOException ioe){
            throw new RuntimeException("Fehler mit einem User" + ioe);
        }
    }
}
