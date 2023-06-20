package homework.day03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 生成10个0-100之间的不重复的随机数,并输出
 * @author Xiloer
 *
 */
public class Test03 {
	public static void main(String[] args) {
		Random rand = new Random();
		List<Integer> list = new ArrayList<>();
		for (int i = 0;i < 10;i++){
			int num = rand.nextInt(101);
			if (!list.contains(num)){
				list.add(num);
			}else {
				i--;
			}
		}
		System.out.println(list);
	}
}
