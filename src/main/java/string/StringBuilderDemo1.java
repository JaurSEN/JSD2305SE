package string;

/**
 * StringBuilder是专门用于编辑字符串的工具类。其内部维护一个可变的字符数组，
 * 因此修改字符串内容是开销小，速度快。并且提供了便于修改字符串内容的相关操作。
 */
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //内部默认开辟16个字符长度的char数组
        StringBuilder builder = new StringBuilder();
        String line = builder.toString();
        System.out.println(line.length());//0
        //基于一个字符串创建StringBuilder
        builder = new StringBuilder("Hello World!");
        line = builder.toString();
        System.out.println(line.length());//12


        /*
        追加操作
        append()方法，相当于String中的“+”
         */
        //                       01234567890123456789
        builder.append("你好");//"Hello World!你好"
        line = builder.toString();
        System.out.println(line);

        /*
            修改内容
            replace(int start,int end,String str)
            将当前字符串中指定范围内的字符串替换为给定内容
            注意：下标含头不含尾
         */
        builder.replace(12,16,"java");
        line = builder.toString();
        System.out.println(line);

        /*
            删除内容
            delete(int start,int end)
            删除当前字符串中指定范围内的字符串
         */
        builder.delete(0,4);
        line = builder.toString();
        System.out.println(line);

        /*
            插入内容
            insert(int index,String str)
            在当前字符串中指定位置插入给定字符串
         */
        builder.insert(0,"你好");
        line = builder.toString();
        System.out.println(line);//你好Hello World!java

        /*
            反转字符串
         */
        builder.reverse();
        line = builder.toString();
        System.out.println(line);//avaj !dlroW olleH好你
    }
}
