package reflect.instance;

/**
 * @author 金龙
 * @date 2018/5/14 at 下午8:33
 */
public class Po3 {
    private int age;
    private String name;
    private Object pool;

    private Po3(int age, String name) {
        this.age = age;
        this.name = name;
        initPool();
    }

    private void initPool() {
        try {
            // 用sleep来模拟一个耗时的任务
            Thread.sleep(5000);
            this.pool = new Object();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
