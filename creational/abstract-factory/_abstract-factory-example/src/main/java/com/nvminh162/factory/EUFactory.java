package com.nvminh162.factory;

import com.nvminh162.product.light.Light;
import com.nvminh162.product.light.EULight;
import com.nvminh162.product.fan.Fan;
import com.nvminh162.product.fan.EUFan;

public class EUFactory implements AbstractFactory {

    @Override
    public Light createLight() {
        return new EULight();
    }

    @Override
    public Fan createFan() {
        return new EUFan();
    }
}
