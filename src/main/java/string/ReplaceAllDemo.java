package string;

public class ReplaceAllDemo {
    public static void main(String[] args) {
        String line = "abc123def456ghi789jkl";
//        line = line.replaceAll("[0-9]+","#NUMBER#");
        line = line.replaceAll("[a-z]+", "#NUMBER#");


//和谐用语
        String regex = "(wqnmlgb|dsb|cnm|fw|mlb|ytdb|nc|nt|ntr|djb)";
        String message = "wqnmlgb!你个dsb,你怎么这么的nc,你绝对是纯纯的djb";
        message = message.replaceAll(regex, "***");
        System.out.println(message);


    }
}
