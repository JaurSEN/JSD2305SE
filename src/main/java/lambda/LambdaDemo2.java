package lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * JDK8之后，在集合Collection上提供了一个方法:forEach
 * 该方法的基于lambda表达式对集合进行遍历的
 */
public class LambdaDemo2 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);
        /*
            forEach方法:
            将集合中每个元素取出并作为参数在调用accept方法时传入
         */
//        c.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        //lambda表达式如果参数只有一个时，参数列表的"()"可以忽略不写
        c.forEach(s->System.out.println(s));
        /*
            当定义lambda表达式时，如果lanbda表达式的参数列表与方法体中调用的方法传入的参数
            一致时，可以简写为:方法引用。格式:对象::方法名
            例如:
            (s)->System.out.println(s);
             ^                      ^
            lambda的参数与调用的方法的参数一致
            简写为:
            System.out::println;

            再例如:
            (x)->oo.sayHello(x);
            简写为:
            oo::sayHello;

            //匿名内部类写法
            Runnable r = new Runnable(){
                public void run(){
                    person.playGame();
                }
            };
            //lambda表达式写法
            Runnable r = ()->person.playGame();
            //方法引用
            Runnable r = person::playGame;

         */
        c.forEach(System.out::println);

    }
}










