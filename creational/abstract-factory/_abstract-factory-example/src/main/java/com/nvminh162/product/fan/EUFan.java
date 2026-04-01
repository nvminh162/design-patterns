package com.nvminh162.product.fan;

public class EUFan implements Fan {

    @Override
    public void turnOn() {
        System.out.println("Turning on EU Fan");
    }
}

