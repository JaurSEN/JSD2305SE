package object;

public class Demo {
    public static void main(String[] args) {
        Point p = new Point();
        p.setX(1);
        p.setY(2);
        System.out.println(p);

        Point p2 = new Point();
        p2.setX(1);
        p2.setY(2);
        System.out.println(p2);
        System.out.println(p == p2);//false
        System.out.println(p.equals(p2));//false
    }
}
