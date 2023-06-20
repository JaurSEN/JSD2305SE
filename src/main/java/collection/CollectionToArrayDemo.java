package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionToArrayDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);
        System.out.println("==================================");
//      由于返回的是对象数组,使用不便捷,因此后期不使用了
//        Object[] array = c.toArray();
        /*
            方法要求传入一个数组,该方法会将集合元素导入到该数组后再将其返回.
            如果数组长度不足(数组length<集合size)则该方法会参考传入的数组类型创建
            一个与集合size等长的数组然后将元素导入后返回
         */
//        String[] array = c.toArray(new String[c.size()]);
//        String[] array = c.toArray(new String[0]);//会返回与集合size等长的数组
        String[] array = c.toArray(new String[10]);//将集合元素存入数组前5个位置,并将数组返回
        System.out.println(array.length);
        System.out.println(Arrays.toString(array));
        System.out.println("==================================");


    }
}
