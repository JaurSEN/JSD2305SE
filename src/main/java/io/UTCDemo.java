package io;

/**
 * UTC:世界协调时
 */
public class UTCDemo {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println(time);

        long max = Long.MAX_VALUE;
        max = max/1000/60/60/24/365;
        System.out.println("公元:"+(1970+max));
    }
}
