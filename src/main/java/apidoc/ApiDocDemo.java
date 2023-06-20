package apidoc;
/**
 * 文档注释,文档注释是功能级注释，用于说明类，方法，常量的作用。
 * 文档注释可以使用javadoc命令生成文档手册
 * 在类上使用时用于说明当前类的作用
 * @author JaurSEN        作者
 * @version 0.0.1           版本号
 * @see java.lang.String    参考（应当是与当前类密切相关的希望同时关注的类）
 * @since JDK 1.8           始于（当前类使用了某个版本特性，就要始于该版本作为最低运行版本）
 * */
public class ApiDocDemo {


    /**
     * 为给定的用户名添加问候语
     * @param name 给定的用户名       parameter：参数
     * @return 返回一个字符串，包含了问候语
     */
    public String sayHello(String name){
        return "你好"+name;
    }
}
