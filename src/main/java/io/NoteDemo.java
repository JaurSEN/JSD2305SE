package io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class NoteDemo {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("test.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw,true);
/*
            PrintWriter的构造器:
            第一个参数是一个输出流，那么该构造器就支持再传入一个boolean类型的参数，表示
            是否开启自动行刷新功能。
            如果开启了自动行刷新功能，那么每当我们调用一次println方法时，就会自动flush一次
         */
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.print("Please enter the content:");
            String line = scan.nextLine();
            if ("exit".equalsIgnoreCase(line)){
                System.out.println("Quit!!!");
                pw.close();
                return;
            }
            pw.println(line);
//            pw.flush();
        }




    }
}
