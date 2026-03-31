package com.nvminh162;

public class Car implements Vehicle {

    public Car() {}

    @Override
    public void drive() {
        System.out.println("Driving a car...");
    }
}
