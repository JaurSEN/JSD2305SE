package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Test1 {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/main/java/io/");

        File[] subs = file.listFiles(f->f.getName().endsWith(".java"));

        System.out.println(subs.length);
        for (File f : subs) {
            FileInputStream fis = new FileInputStream(f);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
        }



    }
}
