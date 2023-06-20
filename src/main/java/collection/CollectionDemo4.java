package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合间的操作:并集，交际，差集
 */
public class CollectionDemo4 {
    public static void main(String[] args) {
//        Collection c1 = new ArrayList();
        Collection c1 = new HashSet();
        c1.add("java");
        c1.add(".net");
        c1.add("c++");
        System.out.println("c1:"+c1);

        Collection c2 = new ArrayList();
        c2.add("android");
        c2.add("ios");
        c2.add("java");//c1中存在的元素
        System.out.println("c2:"+c2);
        /*
            boolean addAll(Collection c)
            将给定集合中的所有元素添加到当前集合中(取并集)
            方法执行后当前集合元素发生了变化则返回true
         */
        c1.addAll(c2);
        System.out.println("c1:"+c1);
        System.out.println("c2:"+c2);


        Collection c3 = new ArrayList();
        c3.add("java");
        c3.add("ios");
//        c3.add("php");
        System.out.println("c3:"+c3);
        /*
            boolean containsAll(Collection c)
            判断当前集合是否包含给定集合的所有元素(包含的判定还是依靠元素自身的equals方法)
         */
//        boolean containsAll = c1.contains(c3);//这里的语义是看c1是否有一个元素为集合c3
        boolean containsAll = c1.containsAll(c3);//判断c1是否包含c3的所有元素
        System.out.println("全部包含:"+containsAll);

        c1.retainAll(c3);
    }
}
