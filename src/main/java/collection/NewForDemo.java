package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class NewForDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four","five"};
        for(int i=0;i<array.length;i++){
            String str = array[i];
            System.out.println(str);
        }
        System.out.println("---------------");
        /*
            新循环，又称为:增强for循环，for each
            新循环是编译器认可，而不是虚拟机认可的，编译器会在编译源代码时将新循环遍历数组改为普通for循环遍历数组
            但是新循环的语法更简洁，所以使用新循环更方便
            新循环遍历数组不会下标越界
         */
        for(String str : array){
            System.out.println(str);
        }

        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);
        System.out.println("---------------");

        for (String e : c){
            System.out.println(e);
        }

        Iterator<String> it = c.iterator();
        while(it.hasNext()){
            String e = it.next();
            System.out.println(e);
        }




    }
}
