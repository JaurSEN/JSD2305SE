package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("test.txt",true);
        while (true){
            System.out.print("Please enter statement:");
            String line = scan.nextLine();
            if ("exit".equals(line)){
                System.out.println("exit!");
                fos.close();
                return;
            }
            fos.write(line.getBytes(StandardCharsets.UTF_8));
        }




    }
}
