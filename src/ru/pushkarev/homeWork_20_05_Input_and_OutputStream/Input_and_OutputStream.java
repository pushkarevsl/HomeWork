package ru.pushkarev.homeWork_20_05_Input_and_OutputStream;

import java.io.*;

public class Input_and_OutputStream {

    private static final int BUFFER_SIZE = 10240;

    public static void main(String[] args) throws IOException {

        InputStream is = new FileInputStream("4.1.mp4");
        OutputStream os = new FileOutputStream("copy 4.1.mp4");

        try {
            byte[] buf = new byte[BUFFER_SIZE];
            int b = is.read(buf);
            while (b != -1) {
                os.write(buf, 0, b);
                b = is.read(buf);
            }
        } finally {
            is.close();
        }
    }
}
