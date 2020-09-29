package com.example.hopejavalib.annotation;

import java.lang.annotation.*;

/**
 * @description: CustomAnnotation
 * *
 * @author: hope
 * *
 * @create: 2020/5/27 1:20 PM
 */
//下面4中属于元注解
@Documented//@Documented: 注解是否应当被包含在 JavaDoc 文档中
@Retention(RetentionPolicy.SOURCE)//@Retention注解的生命周期
@Target({ElementType.TYPE, ElementType.METHOD})//@Target：注解的作用目标
@Inherited//@Inherited：是否允许子类继承该注解, 也就说我们的注解修饰了一个类，而该类的子类将自动继承父类的该注解。
public @interface SourceAnnotation{
//    设置了一个默认值,当只有一个参数的时候，必须使用value的名字
    String value() default "";
}
//ElementType.TYPE：允许被修饰的注解作用在类、接口和枚举上
//ElementType.FIELD：允许作用在属性字段上
//ElementType.METHOD：允许作用在方法上
//ElementType.PARAMETER：允许作用在方法参数上
//ElementType.CONSTRUCTOR：允许作用在构造器上
//ElementType.LOCAL_VARIABLE：允许作用在本地局部变量上
//ElementType.ANNOTATION_TYPE：允许作用在注解上
//ElementType.PACKAGE：允许作用在包上

//RetentionPolicy.SOURCE：当前注解编译期可见，不会写入 class 文件
//RetentionPolicy.CLASS：类加载阶段丢弃，会写入 class 文件
//RetentionPolicy.RUNTIME：永久保存，可以反射获取
