package reflect.constructor;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class TestReflex {
    @Test
    public void test1() throws Exception {
        Class clazz = Class.forName("reflex.Person");
        Constructor constructor = clazz.getConstructor(null);
        Person person = (Person) constructor.newInstance(null);
    }

    @Test
    public void test2() throws Exception {
        Class clazz = Class.forName("reflex.Person");
        Constructor constructor = clazz.getConstructor(String.class);
        Person person = (Person) constructor.newInstance("xiaoxiao");
    }

    @Test
    public void test3() throws Exception {
        Class clazz = Class.forName("reflex.Person");
        Constructor constructor = clazz.getConstructor(String.class, int.class);
        Person person = (Person) constructor.newInstance("xiaoxiao", 21);
    }

    @Test
    public void test4() throws Exception {
        Class clazz = Class.forName("reflex.Person");
        Constructor constructor = clazz.getDeclaredConstructor(List.class);
        constructor.setAccessible(true);//暴力反射，可以用私有的构造器创建对象实例
        Person person = (Person) constructor.newInstance(new ArrayList());
    }

    @Test
    /**不用构造器，直接用类名实例化，默认调用无参构造器*/
    public void test5() throws Exception {
        Class clazz = Class.forName("reflex.Person");
        Person person = (Person) clazz.newInstance();

    }
}