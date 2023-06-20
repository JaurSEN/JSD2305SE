package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合仅能存放【引用类型】元素,并且保存的也是元素的地址(引用)
 */
public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        //当我们存入基本类型元素时，会触发编译器的自动装箱特性
//        c.add(1);//会被编译器改为:c.add(Integer.valueOf(1));
        Point p = new Point(1,2);
        c.add(p);
        System.out.println("p:"+p);//(1,2)
        System.out.println("c:"+c);//[(1,2)]

        p.setX(2);//将p对象的x属性值改为2
        System.out.println("p:"+p);//(2,2)
        System.out.println("c:"+c);//[(2,2)]
    }
}






