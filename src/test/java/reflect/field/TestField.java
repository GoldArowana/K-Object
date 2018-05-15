package reflect.field;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author 金龙
 * @date 2018/5/14 at 下午5:30
 */
public class TestField {
    @Test
    public void test() throws Exception {
        Pojo p = new Pojo();

        // 查看被修改之前的值
        p.printName();

        // 反射获取字段, name成员变量
        Field nameField = p.getClass().getDeclaredField("name");

        // 由于name成员变量是private, 所以需要进行访问权限设定
        nameField.setAccessible(true);

        // 使用反射进行赋值
        nameField.set(p, new StringBuilder("111"));

        // 打印查看被修改后的值
        p.printName();
    }

    @Test
    public void test2() throws Exception {
        Pojo2 p = new Pojo2();

        // 查看被修改之前的值
        p.printName();

        // 反射获取字段, name成员变量
        Field nameField = p.getClass().getDeclaredField("name");

        // 由于name成员变量是private, 所以需要进行访问权限设定
        nameField.setAccessible(true);

        // 使用反射进行赋值
        nameField.set(p, new StringBuilder("111"));

        // 打印查看被修改后的值
        p.printName();
    }

    @Test
    public void test3() throws Exception {
        Pojo3 p = new Pojo3();
        p.printName();
        Field nameField = p.getClass().getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(p, "111");
        p.printName();
    }

    @Test
    public void test3_5() throws Exception {
        Pojo3 p = new Pojo3();
        Field nameField = p.getClass().getDeclaredField("name");
        nameField.setAccessible(true);

        // 使用反射向name进行重新赋值
        nameField.set(p, "111");

        // 再使用反射再把name值取出来
        Object name = nameField.get(p);

        // 把取出来的name值进行打印
        System.out.println(name.toString());
    }

    @Test
    public void test4() throws Exception {
        Pojo4 p = new Pojo4();
        p.printName();
        Field nameField = p.getClass().getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(p, "111");
        p.printName();
    }

    @Test
    public void test5() throws Exception {
        Pojo5 p = new Pojo5();
        p.printName();
        Field nameField = p.getClass().getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(p, "111");
        p.printName();
    }

    @Test
    public void test6() throws Exception {
        Pojo6 p = new Pojo6();
        p.printName();
        Field nameField = p.getClass().getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(p, new StringBuilder("111"));
        p.printName();
    }

    @Test
    public void test7() throws Exception {
        // 注释的这段代码这样使用是错误的
//        Pojo7 p = new Pojo7();
//        p.printName();
//        Field nameField = p.getClass().getDeclaredField("name");
//        nameField.setAccessible(true);
//        nameField.set(p, new StringBuilder("111"));
//        p.printName();

        Pojo7 p = new Pojo7();
        p.printName();
        Field nameField = p.getClass().getDeclaredField("name");
        nameField.setAccessible(true);


        Field modifiers = nameField.getClass().getDeclaredField("modifiers");
        modifiers.setAccessible(true);
        modifiers.setInt(nameField, nameField.getModifiers() & ~Modifier.FINAL);

        nameField.set(p, new StringBuilder("111"));
        modifiers.setInt(nameField, nameField.getModifiers() & ~Modifier.FINAL);
        p.printName();
    }
}
