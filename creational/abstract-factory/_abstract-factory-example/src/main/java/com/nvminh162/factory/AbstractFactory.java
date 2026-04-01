package com.nvminh162.factory;

import com.nvminh162.product.light.Light;
import com.nvminh162.product.fan.Fan;

public interface AbstractFactory {
    Light createLight();

    Fan createFan();
}

