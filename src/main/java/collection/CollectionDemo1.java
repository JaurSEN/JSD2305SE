package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * JAVA 集合框架
 *
 * java.util.Collection 接口,该接口是所有集合的顶级接口,里面定义了所有集合都要具备的功能
 * 集合与数组相似,可以保存一组元素,但是集合有多种不同的数据结构供我们选择,不同的结构体现不同的
 * 性能.
 * 集合将元素的操作全部封装成了方法,使用便捷,而数组需要自行编写代码来完成对元素的维护操作.
 *
 * Collection下有一些常用的分支,下述两个接口都继承自Collection
 * java.util.List:是一个接口,称为线性表,特点:有序且可重复(元素可重复)
 * java.util.Set:是一个接口,特点:不可重复
 * 元素重复的标准:集合中是否存在equals比较为true的元素
 *
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
//        String[] array  = new String[10];
//        array[0] = "one";
//        array[1] = "two";

//        Collection c = new ArrayList();
        Collection c = new HashSet();
        /*
            boolean add(E e)
            向集合中添加给定元素,当元素成功添加后返回true,否则返回false
         */
        boolean success = c.add("one");
        System.out.println("存放是否成功:"+success);
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        success = c.add("one");//List可以存放重复元素,但是Set集合就不行
        System.out.println("存放是否成功:"+success);
        System.out.println(c);
        /*
            int size()
            返回当前集合的元素个数
            如果集合保存的元素个数多于int最大值时,size()仅返回int最大值.
         */
        int size = c.size();
        System.out.println("集合元素个数:"+size);
        /*
            empty:空的
            boolean isEmpty()
            判断当前集合是否为一个空集(不含有任何元素).
            当且仅当集合size为0时返回true.
         */
        boolean isEmpty = c.isEmpty();
        System.out.println("是否为空集:"+isEmpty);
        /*
            void clear()
            清空集合
         */
        c.clear();
        System.out.println("集合已清空");
        System.out.println(c);
        System.out.println("size:"+c.size());
        System.out.println("是否为空集:"+c.isEmpty());
    }
}







