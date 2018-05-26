package com.king.objects.tools;

/**
 * Created By Arowana-King on 2018/3/26 at 下午2:24
 * author 金龙
 * depart 计算机15-8
 * school 哈尔滨理工大学
 * version 1.0
 * describe
 */
public class PlatformDescriptionHelper {
    public static final String HOTSPOT = "Java HotSpot";
    private static final String JVM_NAME = System.getProperty("java.vm.name");

    public static boolean isThisJVM(String name) {
        return JVM_NAME.startsWith(name);
    }

    public static String getThisJVM() {
        return JVM_NAME;
    }
}
