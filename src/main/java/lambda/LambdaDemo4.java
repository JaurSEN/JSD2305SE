package lambda;

import java.io.File;

public class LambdaDemo4 {
    public static void main(String[] args) {
        File dir = new File(".");
        File[] subs = dir.listFiles(f->f.getName().endsWith(".txt"));
        for(File sub : subs){
            System.out.println(sub.getName());
        }
    }
}
