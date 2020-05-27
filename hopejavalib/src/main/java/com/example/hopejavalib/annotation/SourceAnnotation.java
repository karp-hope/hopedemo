package com.example.hopejavalib.annotation;

import java.lang.annotation.*;

/**
 * @description: CustomAnnotation
 * *
 * @author: hope
 * *
 * @create: 2020/5/27 1:20 PM
 */
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface SourceAnnotation{
//    设置了一个默认值,当只有一个参数的时候，必须使用value的名字
    String value() default "";
}
