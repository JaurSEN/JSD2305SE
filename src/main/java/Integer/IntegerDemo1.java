package integer;

/**
 * 包装类
 * java提供了8个包装类，分别对应8个基本类型。
 * 包装类的出现是为了解决基本类型不能参与面向对象开发的问题，使得基本类型可以以对象的形式表达
 *
 * 包装类的命名与基本类型名字一致，只是首字母大写，只有两个类型是特殊的:int和char
 * 例如:
 * double的包装类为Double
 * short的包装类为Short
 *
 * int的包装类为Integer
 * char的包装类Character
 *
 */
public class IntegerDemo1 {
    public static void main(String[] args) {
        //基本类型转换为包装类
        int i = 128;
//        Integer in1 = new Integer(i);
//        Integer in2 = new Integer(i);
        //java建议基本类型转换为包装类时使用包装类的静态方法valueOf
        //Integer的valueOf会重用1字节之内整数对象减少开销
        Integer in1 = Integer.valueOf(i);
        Integer in2 = Integer.valueOf(i);
        System.out.println(in1);
        System.out.println(in2);
        System.out.println(in1==in2);//true
        System.out.println(in1.equals(in2));//true

        double d = 123.123;
        //Double的valueOf内部没有任何优化，就是new。为了风格统一还是建议用valueOf
        Double dou1 = Double.valueOf(d);
        Double dou2 = Double.valueOf(d);
        System.out.println(dou1==dou2);
        System.out.println(dou1.equals(dou2));


        //包装类转换为基本类型
        int i1 = in1.intValue();//通过包装类得到其保存的int值
        System.out.println(i1);
        //包装类也可以将其保存的数字转换为其他的数字类型
        double d1 = in1.doubleValue();
        System.out.println(d1);//126.0
        //向小类型转换时可能丢精度或溢出
        byte b = in1.byteValue();
        System.out.println(b);//-128

    }
}






