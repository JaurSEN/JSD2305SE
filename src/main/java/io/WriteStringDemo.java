package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 向文件中写入文本数据
 */
public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("demo.txt");
        String line = "夜空中最亮的星,能否听清,";
        /*
            字符串String提供了将当前字符串内容转换为一组字节的方法
            byte[] getBytes()
         */
        byte[] data = line.getBytes(StandardCharsets.UTF_8);
        fos.write(data);

        fos.write("那仰望的人心底的孤独和叹息.".getBytes(StandardCharsets.UTF_8));
        System.out.println("写出完毕");

        fos.close();
    }
}







