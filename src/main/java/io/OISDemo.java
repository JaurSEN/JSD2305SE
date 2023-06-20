package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 使用对象输入流进行对象的反序列化操作
 */
public class OISDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //将person.obj中保存的Person实例反序列化回来
        FileInputStream fis = new FileInputStream("person.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        /*
            对象输入流提供的方法:
            Object readObject()
            该方法会从其链接的流中读取字节并进行反序列化还原java对象
            需要注意，读取的字节应当是ObjectOutputStream将一个对象序列化的字节，否则
            会抛出异常:ClassNotFoundException
         */
        Person p = (Person)ois.readObject();
        System.out.println(p);
        ois.close();

    }
}
