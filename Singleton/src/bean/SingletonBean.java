package bean;

/**
 * @author nuonuo
 * @create 2021-10-09 13:27
 */
public class SingletonBean {
    private String name;
    private int age;

    public SingletonBean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public SingletonBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SingletonBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
