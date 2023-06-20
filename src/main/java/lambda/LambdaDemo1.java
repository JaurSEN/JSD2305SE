package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * JDK8之后推出的新特性:lambda表达式
 *
 * lambda表达式可以用更精简的语法创建匿名内部类,使得我们更关注重写方法的逻辑
 * 语法:
 * (参数列表)->{
 *     方法体
 * }
 * 注意:只有实现的接口中仅包含一个抽象方法时,才可以使用lambda表达式
 *
 * 在java API中凡是可以用lambda表达式的接口都有注解:@FunctionalInterface
 * 但是没有该注解，也满足该接口只有一个抽象方法时仍然可以使用lambda
 *
 */
public class LambdaDemo1 {
    public static void main(String[] args) {
        /*
            在集合排序时，定义比较器时的接口:Comparator就可以使用lambda表达式创建
         */
        //为字符串定义比较规则，字多的大
        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        };
        /*
            lambda表达式写法
            该特性还是编译器认可的，编译器编译成字节码文件后，会将lambda改回成内部类
         */
        Comparator<String> com1 = (String o1, String o2)->{
                return o1.length()-o2.length();
        };

        //lambda表达式中参数列表中的参数类型可以不写
        Comparator<String> com2 = (o1,o2)->{
            return o1.length()-o2.length();
        };

        /*
            如果方法只有一句代码，那么方法体的"{}"可以不写，如果这句代码含有return关键字，
            那么再忽略"{}"的同时也要一同忽略return关键字
         */
        Comparator<String> com3 = (o1,o2)->o1.length()-o2.length();

        List<String> list = new ArrayList<>();
        list.add("传奇老师");
        list.add("王克晶");
        list.add("刘桑");
        Collections.sort(list,(o1,o2)->o1.length()-o2.length());
        System.out.println(list);

    }
}
