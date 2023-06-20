package file;

import java.io.File;

public class DeleteFileDemo {
    public static void main(String[] args) {
        File file = new File("./demo.txt");
        boolean flag = file.delete();
        System.out.println(flag ? "删除成功" : "删除失败");


    }
}
