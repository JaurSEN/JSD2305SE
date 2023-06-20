package string;
/**
 * 字符串常量池
 * java建议我们使用字面量形式创建字符串，并会重用对象
 * 凡是使用字面量创建的字符串都会被缓存在常量池中，当我们再次使用相同字面量创建字符串是会重用对象
 * */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "123abc";
        String s2 = s1;
        System.out.println(s1==s2);//true---->重用对象,s1和s2指向同一个对象
        String s3 = "123abc";
        System.out.println(s2==s3);//true---->重用对象,s2和s3指向同一个对象
        String s4 = new String("123abc");//new关键字强制创建新对象
        System.out.println(s2==s4);//false---->不重用对象,s2和s4指向不同对象

        /*
            触发编译器预计算特性
            编译器在编译代码时,如果一个计算表达式中运算符两侧都是字面量时会直接进行计算,将
            结果替换表达式并编译到字节码文件中
            String s5 = "123"+"abc";
            会被编译器改为
            String s5 = "123abc";//因此JVM执行时自然会重用对象
         */
        String s5 = "123"+"abc";//编译器会直接将两个字面量拼接为一个
        System.out.println("s5"+s5);
        System.out.println(s2==s5);//true---->重用对象,s2和s5指向同一个对象

        String s = "123";
        String s6 = s+"abc";//编译器无法在编译期间确定s中的内容，所以不能重用对象
        System.out.println(s2==s6);//false---->不重用对象,s2和s6指向不同对象







    }
}
