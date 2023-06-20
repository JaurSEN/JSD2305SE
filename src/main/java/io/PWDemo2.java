package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 自行完成流链接
 */
public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        //文件流(低级流)，作用:向文件中写入字节(2进制数据)
        FileOutputStream fos = new FileOutputStream("pw2.txt");
        //转换流(高级流)，作用:1:衔接字节流与字符流   2:将写出的字符转换为字节
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        //缓冲字符流(高级流)，作用:内部有一个默认8k的char数组，以块写文本数据来保证写出效率
        BufferedWriter bw = new BufferedWriter(osw);
        //PW(高级流)，作用:1:按行写出字符串  2:自动行刷新
        PrintWriter pw = new PrintWriter(bw);

        pw.println("和我在成都的街头走一走，哦哦哦哦~");
        pw.println("直到所有的灯都熄灭了，也不停留。");
        System.out.println("写出完毕");
        pw.close();

    }
}
