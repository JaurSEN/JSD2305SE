package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListDemo {
    public static void main(String[] args) {
        String[] array = {"one", "two", "three", "four", "five"};
        System.out.println("array:" + Arrays.toString(array));
        //集合的泛型与数组的类型一致
        List<String> list = Arrays.asList(array);
        System.out.println("list:" + list);
        //将集合中的第二个元素换成"six"
        list.set(1,"six");
        System.out.println("list:" + list);
        //注意!!!对该集合的操作就是对原数组对应位置的操作
        System.out.println("array:" + Arrays.toString(array));
        /*
            由于数组是定长的,因此该集合不可做增删元素操作,否则会抛出异常
            UnsupportedOperationException
            不支持的操作异常
         */
//        list.add("seven");

//        List<String> list2 = new ArrayList<>();
//        list2.addAll(list);
        //所有集合都支持一个参数为Collection的构造方法,作用是在创建当前集合的同时，包含给的集合中的所有元素，等同上面两句
        List<String> list2 = new ArrayList<>(list);
        list2.add("seven");
        System.out.println("list2:" + list2);
        System.out.println("array:" + Arrays.toString(array));






    }
}
