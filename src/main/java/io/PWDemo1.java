package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * 缓冲字符流
 * java.io.BufferedWriter与BufferedReader
 * 缓冲字符流内部有一个默认8k的char数组，以块读写方式保证读写文本数据的效率
 *
 * java.io.PrintWriter是具有自动行刷新功能的缓冲字符输出流
 * 它的特点:
 * 1:按行写出字符串
 * 2:自动行刷新
 */
public class PWDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        //向文件中按行写入字符串
        /*
            PrintWriter提供了直接对文件进行写操作的构造器
            PrintWriter(File file)
            PrintWriter(String path)
         */
        PrintWriter pw = new PrintWriter("pw.txt");
        pw.println("和我在成都的街头走一走，哦哦哦哦~");
        pw.println("直到所有的灯都熄灭了，也不停留。");
        System.out.println("写出完毕");
        pw.close();
    }
}



