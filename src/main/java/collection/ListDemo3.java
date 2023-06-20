package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * List集合支持获取子集
 * List subList(int start,int end)
 * 注意两个下标含头不含尾
 */
public class ListDemo3 {
    public static void main(String[] args) {
        //集合只能存放引用类型，泛型也只能指定引用类型，对于基本类型而言要指定对应的包装类
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        //获取3-7这部分子集
        List<Integer> subList = list.subList(3,8);
        System.out.println(subList);
        /*
            将子集每个元素扩大10倍
         */
        for(int i=0;i<subList.size();i++){
//            int num = subList.get(i);
//            num = num*10;
//            subList.set(i,num);
            subList.set(i,subList.get(i)*10);
        }
        System.out.println(subList);//[30, 40, 50, 60, 70]
        //对子集的操作就是对原集合对应元素的操作
        System.out.println(list);

        //将list集合中2-8删除
        list.subList(2,9).clear();//清空子集，原集合对应位置的元素也就删除了

        System.out.println(list);//[0, 1, 9]
    }
}







