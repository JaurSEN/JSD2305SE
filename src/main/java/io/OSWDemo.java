package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/**
 * java将流按照读写单位划分为字节与字符流
 * java.io.InputStream和OutputStream是所有字节输入流与输出流的超类
 * java.io.Reader和Writer是所有字符输入流与输出流的超类。
 * 字节流与字符流超类之间不存在继承关系
 *
 * 字符流都是高级流，字符流是不能独立存在的，字符流以字符为单位进行读写。实际上本质底层最终
 * 还是要读写字节，但是字符流最终会将字符与字节之间进行转换(转换流进行)。
 *
 * 转换流(最常用的字符流，但是实际开发中我们不会直接操作这对流，但是在流链接中是重要的一环)
 * java.io.InputStreamReader和OutputStreamWriter
 *
 */
public class OSWDemo {
    public static void main(String[] args) throws IOException {
        //使用转换流了解字符流读写字符的基本操作
        //向文件osw.txt中写入文本数据
        FileOutputStream fos = new FileOutputStream("demo.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,StandardCharsets.UTF_8);
        osw.write("夜空中最亮的星,能否听清,");
        osw.write("那仰望的人心底的孤独和叹息.");
        System.out.println("写出完毕");
        osw.close();
    }
}







