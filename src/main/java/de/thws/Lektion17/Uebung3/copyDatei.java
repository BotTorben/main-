package de.thws.Lektion17.Uebung3;

import java.io.*;

public class copyDatei {

    public static void copyOhnePuffer(InputStream is, OutputStream os) throws IOException {
        byte[] b = new byte[1];
        int n;
        while ((n = is.read(b)) != -1) {
            os.write(b, 0, n);
        }
    }

    public static void copyMitPuffer(InputStream is, OutputStream os) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(is);
        BufferedOutputStream bos = new BufferedOutputStream(os);

        byte[] b =new byte[1];

        int n;

        while((n = bis.read(b)) != -1){
            bos.write(b, 0, n);
        }
    }

    public static void copyOhnePuffer1024(InputStream is, OutputStream os) throws IOException {

        byte[] b = new byte[1024];
        int n;

        while((n = is.read(b)) != -1){
            os.write(b, 0, n);
        }
    }
}
