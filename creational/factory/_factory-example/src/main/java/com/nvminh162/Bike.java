package com.nvminh162;

public class Bike implements Vehicle {

    public Bike() {}

    @Override
    public void drive() {
        System.out.println("Riding a bike...");
    }
}
