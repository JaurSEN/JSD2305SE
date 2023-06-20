package string;

/**
 * String toUpperCase()
 * 将当前字符串中的英文部分转换为全大写
 *
 * String toLowerCase()
 * 将当前字符串中的英文部分转换为全小写
 */
public class ToUpperCaseDemo {
    public static void main(String[] args) {
        String str = "我爱Java";
        String upper = str.toUpperCase();
        System.out.println(upper);
        String lower = str.toLowerCase();
        System.out.println(lower);

        String code = "AzsF58D";
        String line = "azsf58d";
//        boolean equals = code.equals(line);
//        System.out.println("对比:"+equals);
//
//        code = code.toUpperCase();
//        line = line.toUpperCase();
//        equals = code.equals(line);
//        System.out.println("对比:"+equals);
        //忽略大小写对比字符串内容
        boolean equ = code.equalsIgnoreCase(line);
        System.out.println("对比:"+equ);


    }
}


