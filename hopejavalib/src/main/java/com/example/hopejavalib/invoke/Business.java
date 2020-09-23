package com.example.hopejavalib.invoke;

/**
 * @description: Business 这里相当于静态的代理了
 * *
 * @author: developer
 * *
 * @create: 2020/9/23 11:53 AM
 */
public class Business implements Sell{
    private Sell sell;

    public Business(Sell sell){
        this.sell = sell;
    }

    @Override
    public void sell(){
        sell.sell();
    }

    @Override
    public void ad(){
        sell.ad();
    }
}
