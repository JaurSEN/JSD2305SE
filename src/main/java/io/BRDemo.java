package io;

import java.io.*;

/**
 * 使用缓冲字符输入流按行读取字符串
 */
public class BRDemo {
    public static void main(String[] args) throws IOException {
        //将当前源代码所有内容输出到控制台上
        FileInputStream fis = new FileInputStream(
                "./src/main/java/io/BRDemo.java"
        );
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        /*
            缓冲字符输入流提供的独有方法:
            String readLine()
            读取一行字符串(返回的字符串中不含有该行最后的换行符)，
            如果读取到了空行(这一行只有一个换行符)，方法返回一个空字符串
            如果方法返回null在表达流读取到了末尾

            readLine方法在第一次调用时，并非只读取了一行字符串，实际上缓冲流内部默认有一个
            8k的char数组，所以实际上会先一次性读取8192个字符并存入内部数组，然后从数组中
            扫描第一行内容并将其返回。
         */
        String line;
        while((line = br.readLine())!=null) {
            System.out.println(line);
        }
        br.close();

    }
}




