package com.king.objects.tools;

import com.king.objects.pojo.Father;
import com.king.objects.pojo.Son;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created By Arowana-King on 2018/3/26 at 下午2:48
 * author 金龙
 * depart 计算机15-8
 * school 哈尔滨理工大学
 * version 1.0
 * describe
 */
public class SerializationInstantiatorHelperTest {
    @Test
    public void test() {
        /* clazz肯定是MyThingy自己或者是MyThingy的超类 */
        Class<? super Son> clazz = SerializationInstantiatorHelper.getNonSerializationSuperClass(Son.class);
        System.out.println("在MyThingy类和它的父类中,从子类向父类向上数,第一个未实现Serializable接口的类是: " + clazz);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void test2() throws Exception {
        Class clazz = Class.forName("com.king.KObject.tools.SerializationInstantiatorHelper");
        Method method = clazz.getDeclaredMethod("getNonSerializationSuperClass", Class.class);
        // 获取son的非序列化祖先类
        Object result = method.invoke(clazz, Son.class);
        System.out.println(result);

        //把这个非序列化祖先类实例化出来.
        Constructor con = ((Class) result).getDeclaredConstructor((Class[]) null);
        System.out.println(con);
        Father father = (Father) con.newInstance((Object[]) null);
        System.out.println(father.toString());
    }
}
