package string;

public class MatchesDemo {
    public static void main(String[] args) {
//        [a-zA-Z0-9_]+@[a-zA-Z0-9]+(\.[a-zA-Z]+)+;
        String email = "xinjiarui5@gamil.com";
        String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
        boolean match = email.matches(regex);
        System.out.println(match?"是邮箱":"不是邮箱");
    }
}
