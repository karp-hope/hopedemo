package com.example.hopejavalib.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @description: ClassAnnotation
 * *
 * @author: hope
 * *
 * @create: 2020/5/27 2:19 PM
 */
@Retention(RetentionPolicy.CLASS)
public @interface ClassAnnotation {
    public enum Platform{
        ANDROID, IOS, WEB
    }

    public Platform value() default Platform.ANDROID;

//    没有设置默认值的时候，就必须要进行相关的设置了
    String platform();


}
