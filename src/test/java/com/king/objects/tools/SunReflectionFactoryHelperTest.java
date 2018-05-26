package com.king.objects.tools;

import com.king.objects.pojo.Son;
import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * Created By Arowana-King on 2018/3/26 at 下午3:24
 * author 金龙
 * depart 计算机15-8
 * school 哈尔滨理工大学
 * version 1.0
 * describe
 */
public class SunReflectionFactoryHelperTest {
    /*
     * 坑1: junit会把传的参数自动变为继承Serializable的
     * 坑2: newConstructorForSerialization() 方法中, 有一个标记, 用来区别对待序列化的类和非序列化的类.
     */

    @Test
    public void test() throws Exception {
        Constructor<Son> constructor = SunReflectionFactoryHelper.newConstructorForSerialization(Son.class, Object.class.getConstructor((Class[]) null));
        constructor.setAccessible(true);
        Son son = constructor.newInstance((Object[]) null);
        System.out.println(son);
    }


//    @SuppressWarnings("unchecked")
//    public static void main(String[] args) throws Exception {
//        Constructor<Son> constructor = SunReflectionFactoryHelper.newConstructorForSerialization(Son.class, Object.class.getConstructor((Class[]) null));
//        constructor.setAccessible(true);
//        Son son = constructor.newInstance((Object[]) null);
//        System.out.println(son);
//    }

//    @SuppressWarnings("unchecked")
//    public static void main(String[] args) throws Exception {
//        Constructor<Father> constructor = SunReflectionFactoryHelper.newConstructorForSerialization(Father.class, Object.class.getConstructor((Class[]) null));
//        constructor.setAccessible(true);
//        Father father = constructor.newInstance((Object[]) null);
//        father.toString();
//        System.out.println(father);
//    }
}
