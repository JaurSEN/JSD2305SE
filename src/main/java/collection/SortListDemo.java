package collection;

import java.util.*;

/**
 * 集合的排序
 * 由于List集合是有序集,因此仅对List集合进行排序
 *
 * java.util.Collections是集合的工具类,提供了静态方法:sort,可以对List集合进行自然排序(从小到大,升序)
 *
 * 笔试题常见:
 * Collection与Collections的区别?
 * java.util.Collection是集合的接口,所有的集合都实现了它.
 * 其提供了所有集合都要具备的功能,比如:add,remove,iterator,size...
 *
 * java.util.Collections是集合的工具类,提供了很多的静态方法,便于我们对集合进行操作
 * 比如:排序,翻转集合,对集合乱序,将现有的集合转换为并发安全的集合.
 */
public class SortListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for(int i=0;i<10;i++){
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        Collections.sort(list);//排序
        System.out.println(list);
//        Collections.shuffle(list);//乱序
//        System.out.println(list);
        Collections.sort(list, (o1, o2) -> o2-o1);
        System.out.println(list);

    }
}




