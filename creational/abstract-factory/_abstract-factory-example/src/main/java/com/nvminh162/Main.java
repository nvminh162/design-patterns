package com.nvminh162;

import com.nvminh162.factory.AbstractFactory;
import com.nvminh162.factory.USFactory;
import com.nvminh162.factory.EUFactory;
import com.nvminh162.product.light.Light;
import com.nvminh162.product.fan.Fan;

public class Main {

    public static void client(AbstractFactory factory) {
        Light light = factory.createLight();
        Fan fan = factory.createFan();

        light.turnOn();
        fan.turnOn();
    }

    public static void main(String[] args) {
        AbstractFactory usFactory = new USFactory();
        client(usFactory);

        AbstractFactory euFactory = new EUFactory();
        client(euFactory);
    }
}
