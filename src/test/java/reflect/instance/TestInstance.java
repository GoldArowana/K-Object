package reflect.instance;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * @author 金龙
 * @date 2018/5/14 at 下午6:37
 */
public class TestInstance {
    @Test
    public void test() throws Exception {
        Constructor<Po> con = Po.class.getDeclaredConstructor();
        con.setAccessible(true);
        Po p = con.newInstance();
        System.out.println(p.hashCode());
    }

    @Test
    public void test2() throws Exception {
        Constructor<Po2> con = Po2.class.getDeclaredConstructor(int.class, String.class);
        con.setAccessible(true);
        Po2 p = con.newInstance(3344, "str123");
        System.out.println(p.hashCode());
    }
}
