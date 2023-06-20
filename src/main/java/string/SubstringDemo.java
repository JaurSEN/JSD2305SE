package string;
/**
 * String substring(int start,int end)
 * 截取当前字符串从下标start到end之间的内容.
 * 注意在javaAPI中有一个特点:用两个数字表示范围时,通常都是含头不含尾的
 */
public class SubstringDemo {
    public static void main(String[] args) {
        //            01234567890
        String str = "www.tedu.cn";

        //截取下标范围[4,8)的字符串
        String sub = str.substring(4,8);
        System.out.println(sub);

        //重载的substring(int start)从指定位置截取到字符串末尾
        System.out.println(str.substring(4));
    }
}
