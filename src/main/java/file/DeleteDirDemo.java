package file;

import java.io.File;

public class DeleteDirDemo {
    public static void main(String[] args) {
        File dir = new File("xjr");
        if (dir.exists()){
            dir.delete();
            System.out.println("文件夹删除成功");
        }else {
            System.out.println("文件夹不存在");
        }
    }
}
