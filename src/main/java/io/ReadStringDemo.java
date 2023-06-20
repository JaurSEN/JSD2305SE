package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 从文件中读取文本数据
 */
public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("demo.txt");
        FileInputStream fis = new FileInputStream(file);
        //创建与文件等长的数组
        byte[] data = new byte[(int) file.length()];
        //从文件中先将所有的字节读取到data数组中
        fis.read(data);
        //再使用String的构造方法将data数组所有内容按照UTF-8编码还原为文字
        String line = new String(data, StandardCharsets.UTF_8);
        System.out.println(line);

        fis.close();
    }
}






