package file;

import java.io.File;

/**
 * file:文件
 * io:input与output 即:输入与输出
 *
 * java.io.File类
 * File类的每一个实例用于表示硬盘上的一个文件或目录(严谨的说法时表示操作系统中文件系统里的
 * 一个文件或目录)，实际内部仅保存类一个路径
 *
 * 使用File可以:
 * 1:访问其表示的文件或目录的属性
 * 2:创建或删除文件和目录
 * 3:访问一个目录中的子项
 * 但是File不能读写文件数据
 */
public class FileDemo {
    public static void main(String[] args) {
        /*
            创建File时指定想表示的文件或目录的路径
            路径的格式:
            绝对路径:从操作系统要求的根目录开始
                    优点:清晰明了，直观就能看出实际位置
                    缺点:不利于跨平台
            相对路径:
            常见的相对路径
                1:当前目录:"./"
                2:类加载路径(后期学习)
                3:当前类所在的目录(后期学习)
                优点:利于跨平台
                缺点:不清晰明了，具体位置要视程序的运行环境而定

                以当前目录为例，现在我们程序实在IDEA中执行， IDEA就是我们程序的运行环境，此时它
                规定的当前目录"./"就是当前程序所在的项目目录

         */
//        File file = new File("C:/Users/TEACHER/IdeaProjects/JSD2305SE/demo.txt");
        File file = new File("./demo.txt");
        //获取名字
        String name = file.getName();
        System.out.println(name);
        //返回文件的长度(占用磁盘空间的字节数)
        long length = file.length();
        System.out.println(length);
        //是否可读
        boolean cr = file.canRead();
        //是否可写
        boolean cw = file.canWrite();
        System.out.println("可读:"+cr);
        System.out.println("可写:"+cw);
        //是否隐藏
        boolean hidden = file.isHidden();
        System.out.println("是否隐藏:"+hidden);

    }
}
