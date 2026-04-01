package com.nvminh162;

public class Bus implements Vehicle {

    public Bus() {}

    @Override
    public void drive() {
        System.out.println("Driving a bus...");
    }

    public void otherMethod() {
        System.out.println("Bus other method");
    }
}
