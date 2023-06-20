package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 排序字符串
 *
 * 当我们排序集合时,元素本身可比大小,但是该比较规则不满足我们排序需求时也可以额外指定比较
 * 规则
 */
public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("Tom");
//        list.add("Jerry");
//        list.add("bob");
//        list.add("ada");
//        list.add("jackson");
//        list.add("jack");
//        list.add("rose");
//        list.add("hanmeimei");
//        list.add("lilei");
//        list.add("james");
        list.add("传奇老师");
        list.add("王克晶");
        list.add("刘桑");
        System.out.println(list);
//        Collections.sort(list);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        });
        System.out.println(list);



    }
}
