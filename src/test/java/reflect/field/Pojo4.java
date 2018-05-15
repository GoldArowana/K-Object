package reflect.field;

/**
 * @author 金龙
 * @date 2018/5/14 at 下午5:47
 */
public class Pojo4 {
    // 防止JVM编译时就把"default4"作为常量处理
    private final String name = (null == null ? "default4" : "");

    public void printName() {
        System.out.println(name);
    }
}
