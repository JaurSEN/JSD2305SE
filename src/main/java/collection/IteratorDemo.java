package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合的遍历
 * Collection接口为遍历元素提供了方法:
 * Iterator iterator()            die(二声)
 * 该方法会返回一个用于遍历当前集合元素的迭代器
 *
 * java.util.Iterator接口，迭代器接口。
 * 不同的集合都提供了用于遍历自身元素的迭代器实现类，我们无需关心实现类的名字，只要会使用
 * 迭代器的相关方法遍历集合元素即可。
 *
 * 迭代器模式:遍历集合遵循的步骤:问->取->删(删除元素不是遍历的必要操作)
 *
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("one");
        c.add("#");
        c.add("two");
        c.add("#");
        c.add("three");
        c.add("#");
        c.add("four");
        c.add("#");
        c.add("five");
        System.out.println(c);
        /*
            boolean hasNext()
            询问是否还有下一个元素。如果集合还有下一个元素可供遍历，则方法返回true

            E next()
            迭代器向后移动一个位置，并将该位置上的元素返回。

            注意:迭代器末尾开始时，位置实在集合第一个元素之前
         */
        Iterator it = c.iterator();
        while(it.hasNext()){//问
            String e = (String)it.next();//取
            //开发中当出现字符串变量与字面量equals时，要用字面量.equals(变量)。避免因为变量为null产生空指针异常
            if("#".equals(e)){
                //迭代器要求:遍历过程中不可以通过集合的方法增删元素，否则会抛出异常
//                c.remove(e);
                it.remove();//删(删除本次next获取的元素)
            }
            System.out.println(e);
        }

        System.out.println(c);

    }
}







