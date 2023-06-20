package string;

public class Test {
    public static void main(String[] args) {
        String s1 = "http://www.tedu.cn";
        String s2 = "www.tarena.com.cn";
        String name1 = getHostName(s1);
        String name2 = getHostName(s2);
        System.out.println(name1);//tedu
        System.out.println(name2);//tarena

    }
    public static String getHostName(String url){
        int start = url.indexOf(".")+1;
        int end = url.indexOf(".", start);

        return url.substring(start, end);
    }


}
