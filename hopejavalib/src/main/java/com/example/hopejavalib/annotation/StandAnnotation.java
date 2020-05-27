package com.example.hopejavalib.annotation;

/**
 * @description: StandAnnotation
 * * 主要是用来验证一些标准的 annotation的，这里列出来了3个标准的annotation，
 * @Override，@Deprecated，@SuppressWarnnings
 * @author: hope
 * *
 * @create: 2020/5/27 1:05 PM
 */
public class StandAnnotation extends StandAnnonationParent{

    @Override
    public void parentFun() {
        super.parentFun();
    }

    @Deprecated
    public void deprecateAnnonationFun(){

    }

    /**
     * SuppressWarnings里面的参数可以进入其定义中查看
     * 用于通知java编译器禁止特定的编译警告
     */
    @SuppressWarnings("unused")
    public void suppressAnnoFun(){

    }

    @SuppressWarnings("unchecked")
    public void unUsed(){

    }
}
