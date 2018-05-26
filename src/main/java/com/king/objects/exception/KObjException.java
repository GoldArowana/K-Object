package com.king.objects.exception;

/**
 * Created By Arowana-King on 2018/3/26 at 下午2:12
 * author 金龙
 * depart 计算机15-8
 * school 哈尔滨理工大学
 * version 1.0
 * describe
 */
public class KObjException extends RuntimeException {
    public KObjException() {
    }

    public KObjException(String message) {
        super(message);
    }

    public KObjException(String message, Throwable cause) {
        super(message, cause);
    }

    public KObjException(Throwable cause) {
        super(cause);
    }
}
