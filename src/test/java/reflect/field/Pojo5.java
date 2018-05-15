package reflect.field;

/**
 * @author 金龙
 * @date 2018/5/14 at 下午5:57
 */
public class Pojo5 {
    private final String name = new StringBuilder("default5").toString();

    public void printName() {
        System.out.println(name);
    }
}
