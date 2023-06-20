package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 排序自定义类型元素的集合
 */
public class SortListDemo2 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(3,7));
        list.add(new Point(25,68));
        list.add(new Point(43,79));
        list.add(new Point(6,10));
        list.add(new Point(33,2));
        System.out.println(list);
        /*
            compare:比较

            Collections的sort方法在排序List集合时,要求集合元素必须实现接口:Comparable

            当我们使用一个API完成某个功能时,该API要求我们为其修改其他额外的代码,那么该现象
            称为侵入性.
            比如下述代码:
            Collections.sort(list);
            该方法要求集合元素必须实现接口Comparable,意味着我们希望使用这个API来排序集合
            时,它要求我们为其在我们的类Point上实现额外的接口Comparable.
         */
//        Collections.sort(list);

        /*Comparator<Point> c = new Comparator<Point>(){
            *//*
                compare方法用于定义o1与o2比较大小的规则
                返回值用于表达大小关系:
                当返回值>0时,表达o1>o2
                当返回值<0时,表达o1<o2
                当返回值=0时,表达o1=o2
             *//*
            public int compare(Point o1, Point o2) {
                //比较大小的规则:点到原点的距离长的大
                //计算o1到原点的距离
                int olen1 = o1.getX()*o1.getX()+o1.getY()*o1.getY();
                //计算o2到原点的距离
                int olen2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
                return olen1-olen2;
            }
        };*/
        Collections.sort(list,new Comparator<Point>(){
            public int compare(Point o1, Point o2) {
                int olen1 = o1.getX()*o1.getX()+o1.getY()*o1.getY();
                int olen2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
                return olen1-olen2;
            }
        });

        System.out.println(list);
    }
}

