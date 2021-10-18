import bean.SingletonBean;

/**
 * 懒汉式
 * @author nuonuo
 * @create 2021-10-09 13:30
 */
public class Singleton1 {
    private static SingletonBean singletonBean = null;
    
    private Singleton1() {}

    public static SingletonBean getInstance() {
        if (singletonBean == null) {
            singletonBean = new SingletonBean("张三", 10);
        }
        return singletonBean;
    }
}
