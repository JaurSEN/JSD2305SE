package collection;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * java.util.List 线性表，是可以存放重复元素且有序的集合。
 * List集合在Collection提供的功能基础上额外定义了一组可以通过下标操作元素的方法
 *
 * List接口下面有两个常用的实现类
 * java.util.ArrayList:内部就是使用数组实现的List，ArrayList查询效率高，增删慢
 * java.util.LinkedList:内部是使用链表实现的List，LinkedList增删效率高，查询效率慢
 * 在性能没有特别苛刻的要求时，通常使用ArrayList即可。
 */
public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        List<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);
        /*
            E get(int index)
            获取List集合中指定下标处对应的元素
         */
        //获取集合第三个元素
        String e = list.get(2);//array[2]
        System.out.println(e);
        //List集合可以通过普通的for循环遍历
        for(int i=0;i<list.size();i++){
            e = list.get(i);
            System.out.println(e);
        }

        /*
            E set(int index,E e)
            将给定元素e设置到指定下标index处。返回值为该下标被替换的元素
         */
        String old = list.set(2,"six");
        System.out.println(list);
        System.out.println("被替换的元素是:"+old);


        /*
            将集合反转
         */
//        java.util.Collections是集合的工具类，提供了很多静态方法帮助操作集合
//        Collections.reverse(list);//反转集合元素

//        for(int i=0;i<list.size()/2;i++){
//            //获取正数位置上的字符
//            String s = list.get(i);
//            //将正数位置上的字符设置到倒数位置上
//            s = list.set(list.size()-1-i,s);
//            //将原倒数位置的元素设置到正数位置上
//            list.set(i,s);
//        }

        for(int i=0;i<list.size()/2;i++){
            list.set(i,list.set(list.size()-1-i,list.get(i)));
        }

        //[one, two, six, four, five]
        //[five, four, six, two, one]
        System.out.println(list);
    }
}





