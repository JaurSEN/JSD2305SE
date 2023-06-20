package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("传奇老师");
        list.add("王克晶");
        list.add("刘桑");
        System.out.println(list);
//        Collections.sort(list,(o1,o2)->o1.length()-o2.length());
        list.sort((o1,o2)->o1.length()-o2.length());
        System.out.println(list);







    }
}
