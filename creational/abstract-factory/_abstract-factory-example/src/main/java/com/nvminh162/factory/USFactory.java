package com.nvminh162.factory;

import com.nvminh162.product.light.Light;
import com.nvminh162.product.light.USLight;
import com.nvminh162.product.fan.Fan;
import com.nvminh162.product.fan.USFan;

public class USFactory implements AbstractFactory {

    @Override
    public Light createLight() {
        return new USLight();
    }

    @Override
    public Fan createFan() {
        return new USFan();
    }
}

