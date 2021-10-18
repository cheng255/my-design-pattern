import bean.SingletonBean;

/**
 * 饿汉式
 * @author nuonuo
 * @create 2021-10-09 13:34
 */
public class Singleton2 {
    private static SingletonBean singletonBean = new SingletonBean("张三", 10);

    private Singleton2() {}

    public static SingletonBean getInstance() {
        return singletonBean;
    }
}
