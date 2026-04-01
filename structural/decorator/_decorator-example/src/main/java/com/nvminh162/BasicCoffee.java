package com.nvminh162;

// Concrete Component - Cà phê cơ bản
public class BasicCoffee implements Coffee {
    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Cà phê";
    }
}
