package com.nvminh162.decorator.component;

import com.nvminh162.decorator.core.Coffee;

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
