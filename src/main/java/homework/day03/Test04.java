package homework.day03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 生成10个0-100的随机数并存入一个List集合中并输出
 * 之后将集合第3到第6个元素翻转并输出
 * 
 * @author Xiloer
 *
 */
public class Test04 {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < 10;i++){
            int num =rand.nextInt(101);
            list.add(num);
        }
        System.out.println(list);
        List<Integer> subList = list.subList(3,6);
        Collections.reverse(subList);
        System.out.println(subList);
    }

}
