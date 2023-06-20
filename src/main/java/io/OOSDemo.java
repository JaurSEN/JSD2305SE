package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流
 * java.io.ObjectInputStream与ObjectOutputStream
 * 对象流是一对高级流，作用是进行对象序列化与反序列化
 *
 * 对象序列化:将一个java对象转换为一组可用于保存或网络传输的字节的过程
 */
public class OOSDemo {
    public static void main(String[] args) throws IOException {
        //将一个Person实例保存到文件person.obj中
        String name = "王克晶";
        int age = 18;
        char gender = '女';
        String[]  otherInfo = {"嗓门大","黑","技术好","启蒙老师","廊坊佳木斯人"};
        Person person = new Person(name,age,gender,otherInfo);

        FileOutputStream fos = new FileOutputStream("person.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(person);
        System.out.println("写出完毕");

        oos.close();


    }
}






