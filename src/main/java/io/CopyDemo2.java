package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 通过提高每次读写的数据量，减少实际读写的次数，可以提高读写效率
 * 一组字节一次性读写被称为:块读写操作
 *
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./1.png");
        FileOutputStream fos = new FileOutputStream("./1_1.png");
        /*
            java.io.InputStream超类上定义了块读操作
            int read(byte[] data)
            一次性读取给定字节数组总长度的字节量并存入到该数组中，返回值为实际读取到的字节量
            如果返回值为整数-1则表示流读取到末尾了


            以文件流读取文件为例
            原文件内容(7个字节):
            11001100 10101010 01010101 00001111 11110000 11000011 11110000

            byte[] data = new byte[3];//长度为3的字节数组
            int len;//记录每次实际读取的字节数

            第一次读取:
            len = fis.read(data);//一次性读取3个字节

            原文件内容(7个字节):
            11001100 10101010 01010101 00001111 11110000 11000011 11110000
            ^^^^^^^^ ^^^^^^^^ ^^^^^^^^
            本次读取的3个字节

            data:[11001100, 10101010, 01010101]
            len:3  整数3表达本次实际读取到了3个字节


            ---------------------------------------------------------------

            第二次读取:
            len = fis.read(data);//一次性读取3个字节

            原文件内容(7个字节):
            11001100 10101010 01010101 00001111 11110000 11000011 11110000
                                       ^^^^^^^^ ^^^^^^^^ ^^^^^^^^
                                       本次读取的3个字节

            data:[00001111, 11110000, 11000011]
            len:3  整数3表达本次实际读取到了3个字节


            ---------------------------------------------------------------

            第三次读取:
            len = fis.read(data);//一次性读取3个字节

            原文件内容(7个字节):
            11001100 10101010 01010101 00001111 11110000 11000011 11110000
                                                                  ^^^^^^^^ ^^^^^^^^ ^^^^^^^^
                                                                  本次读取的1个字节

            data:[11110000, 11110000, 11000011]
                  本次读取   |---上次的旧数据---|
            len:1  整数1表达本次实际读取到了1个字节



            第四次读取:
            len = fis.read(data);//一次性读取3个字节

            原文件内容(7个字节):
            11001100 10101010 01010101 00001111 11110000 11000011 11110000
                                                                            ^^^^^^^^ ^^^^^^^^ ^^^^^^^^
                                                                            文件末尾，没有读取任何字节

            data:[11110000, 11110000, 11000011]
                  |-------上次的旧数据---------|
            len:-1  整数-1表达已经读取到流的末尾了




            java.io.OutputStream字节输出流超类上定义了块写操作
            void write(byte[] data)
            一次性将给定字节数组data中所有的字节写出




         */
        /*
            00000000  8位2进制  1字节  1byte
            1024byte  1kb
            1024kb    1mb
            1024mb    1gb
            1024gb    1tb
            1024tb    1pb
         */
        byte[] data = new byte[1024*10];//10kb
        int len;

        long start = System.currentTimeMillis();
        while((len = fis.read(data))!=-1){
            fos.write(data,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕,耗时:"+(end-start)+"ms");
        fis.close();
        fos.close();
    }
}
