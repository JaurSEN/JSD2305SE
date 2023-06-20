package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JAVA IO
 * IO:Input和Output 即:输入与输出
 *
 * 输入是从外界到程序中的方向,是我们程序用于获取外界信息的过程,是"读"的过程
 * 输出是从程序到外界的方法,是我们程序向外界发送信息的过程,是"写"的过程
 *
 * java.io.InputStream与OutputStream
 * 输入流与输出流   流
 * 这里的流相当于是程序与外界相连的一根管道,用于传输数据.而数据就是字节(2进制)
 *
 * InputStream和OutputStream是两个超类,抽象类.
 * java中实际用于读写数据的流都继承自他们.
 *
 * 文件流
 * java.io.FileInputStream和FileOutputStream
 * 这两个流就继承自InputStream和OutputStream
 * 这两个流是用于连接我们程序和文件之间的管道,读写文件数据(读写硬盘)
 */
public class FOSDemo {
    public static void main(String[] args) throws IOException {
        //向文件fos.dat中写入数据
        /*
            文件输出流常用的构造器
            FileOutputStream(String path)
            FileOutputStream(File file)
            文件流创建时如果指定的文件不存在会将其自动创建出来，前提是该文件所在的目录
            必须存在，否则会抛出异常:java.io.FileNotFoundException:系统找不到指定的路径
         */
//        File file = new File("./fos.dat");
//        FileOutputStream fos = new FileOutputStream(file);

        FileOutputStream fos = new FileOutputStream("./fos.dat");
        /*
            向文件中写入一个字节:
            在java.io.OutputStream(字节输出流超类)上定义了写出一个字节的方法:
            void write(int d)
            将给定的int值所对应的2进制的"低8位"写出

            文件输出流继承OutputStream后就重写了write方法，作用相同，就是将给定的
            int值对应2进制的"低八位"写入到文件中

            例如:
            fos.write(1);

            int型整数1的2进制样子:
            00000000 00000000 00000000 00000001
                                       ^^^^^^^^
                                       写出的字节

            写出后fos.dat文件中的样子(长度1字节):
            00000001



            fos.write(2);
            int型整数1的2进制样子:
            00000000 00000000 00000000 00000010
                                       ^^^^^^^^
                                       写出的字节
            写出后fos.dat文件中的样子(长度2字节):
            00000001 00000010



            fos.write(13);
            int型整数1的2进制样子:
            00000000 00000000 00000000 00001101
                                       ^^^^^^^^
                                       写出的字节
            写出后fos.dat文件中的样子(长度3字节):
            00000001 00000010 00001101
         */
        fos.write(1);
        fos.write(2);
        fos.write(13);
        System.out.println("写出完毕");

        fos.close();//当不再需要写出数据时，最后要将流关闭来释放资源

    }
}






