package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * 使用转换流了解字符流读取字符操作
 */
public class ISRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("demo.txt");
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        /*
            字符输入流读取字符的操作
            int read()
            读取并返回一个字符，返回的int值实际上是一个char。但是如果返回值为整数-1表达
            流读取到了末尾

         */
        int d;
        while((d = isr.read())!=-1){
            System.out.print((char)d);
        }
        isr.close();

    }
}
