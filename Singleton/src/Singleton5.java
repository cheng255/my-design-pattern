import bean.SingletonBean;

/**
 * 静态内部类
 * @author nuonuo
 * @create 2021-10-09 20:22
 */
public class Singleton5 {

    private Singleton5() {
    }

    private static class A {
        private static SingletonBean bean = new SingletonBean("张三", 20);
    }

    public static SingletonBean getInstance() {
        return A.bean;
    }

    public static void main(String[] args) {
        SingletonBean instance1 = Singleton5.getInstance();
        SingletonBean instance2 = Singleton5.getInstance();
        System.out.println(instance1 == instance2);
    }

}
