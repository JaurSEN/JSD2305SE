package string;

/**
 * 字符串拼接性能问题
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String str = "a";
        for (int i = 0; i < 100000; i++) {
            str += "a";
        }
        System.out.println(str);
    }
}
