package string;

/**
 * char charAt(int index)
 * 获取当前字符串指定位置上的字符
 */
public class ChatAtDemo {
    public static void main(String[] args) {
        //            01234567890
        String str = "www.tedu.cn";
        char c = str.charAt(4);
        System.out.println(c);//t

        String line = "上海自来水来自海上";
        for (int i = 0; i < line.length() / 2; i++) {
            char c1 = line.charAt(i);
            char c2 = line.charAt(line.length() - 1 - i);
            if (c1 != c2) {
                System.out.print("不");
                break;
            }
        }
        System.out.println("是回文");

        /*String line = "上海自来水来自海上";
        for (int i = 0; i < line.length() / 2; i++) {
            char c1 = line.charAt(i);
            char c2 = line.charAt(line.length() - 1 - i);
            if (c1 != c2) {
                System.out.println("不是回文");
                return;//结束方法,不再执行下面的代码
            }
        }
        System.out.println("是回文");*/

        /*boolean flag = true;
        for (int i = 0; i < line.length() / 2; i++) {
            char c1 = line.charAt(i);
            char c2 = line.charAt(line.length() - 1 - i);
            if (c1 != c2) {
                flag = false;
                System.out.println("不是回文");
                break;
            }
            if (flag) {
                System.out.println("是回文");
            }
        }*/
    }
}
