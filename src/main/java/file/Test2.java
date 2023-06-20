package file;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        File dir = new File("./myDir");
        if(dir.isDirectory()){
            File[] subs = dir.listFiles();
            for (File sub : subs) {
                if(sub.exists()){
                    sub.delete();
                }
            }
            dir.delete();
            System.out.println("删除成功");

        }
    }
}
