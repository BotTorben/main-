package de.thws.KlausurUebungen.Kopierer;

import java.io.*;

public class CopyFile {

    public static void copy(){

        try(FileInputStream fi = new FileInputStream("quelle.dat");
            FileOutputStream fo = new FileOutputStream("ziel.dat")){

            int b;
            while((b = fi.read()) != -1){
                fo.write(b);
            }
        } catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

    public static void copyWithBufferd(){

        try(BufferedInputStream bfi = new BufferedInputStream(new FileInputStream("quelle.dat"));
            BufferedOutputStream bfo = new BufferedOutputStream(new FileOutputStream("ziel.dat"))){

            bfo.flush();

            byte[] buffer = new byte[4096];
            int b;
            while((b = bfi.read(buffer)) != -1){
                bfo.write(buffer, 0, b);
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

    public static void copyTextFileBuffered(){

        try(BufferedInputStream bfi = new BufferedInputStream(new ObjectInputStream(new FileInputStream("perso.dat")))){

        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
