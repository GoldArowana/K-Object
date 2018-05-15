package reflect.instance;

/**
 * @author 金龙
 * @date 2018/5/14 at 下午6:42
 */
public class Po2 {
    private Po2(int a, String b) {
        System.out.println("这里是构造器内部:" + a);
        System.out.println("这里是构造器内部:" + b);
    }
}
