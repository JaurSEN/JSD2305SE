package string;

/**
 * boolean startsWith(String str)
 * 判断当前字符串是否是以指定字符串开始的
 *
 * boolean endsWith(String str)
 * 判断当前字符串是否是以指定字符串结尾的
 */
public class StartsWithDemo {
    public static void main(String[] args) {
        String str = "www.tedu.cn";
        boolean starts = str.startsWith("www");
        System.out.println(starts);//true

        starts = str.startsWith("WWW");
        System.out.println(starts);//false

        boolean ends = str.endsWith("cn");
        System.out.println(ends);
    }
}
