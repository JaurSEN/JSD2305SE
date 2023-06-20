package string;
/**
 * int indexOf(String str)
 * 检索给定字符串在当前字符串中的位置，如果当前字符串不含有指定内容则返回-1*/
public class IndexOfDemo {
    public static void main(String[] args) {
        //            0123456789012345
        String str = "thinking in java";
        System.out.println(str.indexOf("in"));//2
        System.out.println(str.indexOf("IN"));//-1

        //重载的indexOf方法可以从指定位置开始检索第一次出现给定字符串的位置
        System.out.println(str.indexOf("in",7));//9

        //检索最后一次出现给定字符串的位置
        System.out.println(str.lastIndexOf("in"));//9
    }
}
