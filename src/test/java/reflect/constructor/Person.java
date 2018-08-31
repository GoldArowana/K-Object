package reflect.constructor;

import java.util.List;

/**
 * 利用反射实例化对象
 */
public class Person {
    public Person() {
        System.out.println("调用无参构造器");
    }

    public Person(String name) {
        System.out.println(name);
    }

    public Person(String name, int age) {
        System.out.println(name + ":" + age);
    }

    /**
     * 私有构造方法，外部不能调用，但是可以通过反射调用
     */
    private Person(List list) {
        System.out.println("调用私有的无参构造器");
    }
}