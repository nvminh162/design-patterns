package com.nvminh162;

import com.nvminh162.factory.AbstractFactory;
import com.nvminh162.factory.USFactory;
import com.nvminh162.factory.EUFactory;
import com.nvminh162.product.light.Light;
import com.nvminh162.product.fan.Fan;

public class Main {

    // sử dụng Abstract factory
    public static void client(AbstractFactory factory) {
        Light light = factory.createLight();
        Fan fan = factory.createFan();

        light.turnOn();
        fan.turnOn();
    }

    public static void main(String[] args) {
        // tạo ra factory thị trường mỹ
        AbstractFactory usFactory = new USFactory();
        client(usFactory); // output: Turning on US Light, Turning on US Fan

        // tạo ra factory thị trường châu âu
        AbstractFactory euFactory = new EUFactory();
        client(euFactory); // output: Turning on EU Light, Turning on EU Fan
    }
}
