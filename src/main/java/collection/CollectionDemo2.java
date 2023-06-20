package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 元素的equals方法影响集合的某些操作,常见的有:
 * contains和remove方法
 * 包含      删除
 *
 * 元素的toString方法也会影响集合的toString方法
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Point(1,2));
        c.add(new Point(3,4));
        c.add(new Point(5,6));
        c.add(new Point(7,8));
        c.add(new Point(1,2));
        /*
            集合重写了toString方法.返回的字符串格式:
            [元素1.toString(), 元素2.toString(), ....]
            因此,如果元素没有妥善的重写toString方法,那么输出集合时元素内容就不直观了
         */
        System.out.println(c);

        Point p = new Point(1,2);
        /*
            boolean contains(Object o)
            判断当前集合是否包含给定元素,若包含则方法返回true否则返回false
            集合判断是否包含给定元素的逻辑为:给定元素是否与集合现有元素存在equals比较为true的
            情况,存在则认为包含该元素
         */
        //Point没有重写equals方法时这里判断为不包含,重写后则认为包含.
        boolean contains = c.contains(p);//判断当前集合是否包含元素p
        System.out.println("是否包含:"+contains);

        /*
            remove方法用于从集合中删除给定元素.删除逻辑:删除集合中与给定元素equals比较为true
            的元素.
            因此元素的equals方法也影响着集合的remove操作

            对于List集合而言,如果删除的是集合中的重复元素,那么仅会删除最靠前的第一个,而
            不是将所有equals为true的元素都删除.
         */
        //同样的如果Point重写了equals方法则会删除元素,否则集合元素不会有变化
        c.remove(p);
        System.out.println(c);
    }
}
