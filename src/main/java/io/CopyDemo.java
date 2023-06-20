package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("1_cp.png");
        FileInputStream fis = new FileInputStream("1.png");
        long start = System.currentTimeMillis();
        int d;
        while ((d= fis.read())!=-1){
            fos.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("over!"+(end-start)+"ms");
        fis.close();
        fos.close();
    }
}
