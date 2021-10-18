import bean.SingletonBean;

/**
 * 懒汉式   ---线程安全
 *
 * @author nuonuo
 * @create 2021-10-09 13:35
 */
public class Singleton3 {
    private static volatile SingletonBean singletonBean = null;

    private Singleton3() {
    }

    public static SingletonBean getInstance() {
        if (singletonBean == null)
            synchronized (Singleton3.class) {
                if (singletonBean == null)
                    singletonBean = new SingletonBean("张三", 10);
            }
        return singletonBean;
    }
}
