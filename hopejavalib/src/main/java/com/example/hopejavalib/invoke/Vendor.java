package com.example.hopejavalib.invoke;

/**
 * @description: Vendor
 * *
 * @author: developer
 * *
 * @create: 2020/9/23 11:24 AM
 */
public class Vendor implements Sell{
    @Override
    public void sell() {
        System.out.println("Vendor sell");
    }

    @Override
    public void ad() {
        System.out.println("Vendor ad");
    }
}
