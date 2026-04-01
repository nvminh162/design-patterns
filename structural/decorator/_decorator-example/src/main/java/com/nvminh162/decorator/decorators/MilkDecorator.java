package com.nvminh162.decorator.decorators;

import com.nvminh162.decorator.core.Coffee;
import com.nvminh162.decorator.core.CoffeeDecorator;

// Concrete Decorator - Thêm sữa
public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost() {
        return super.getCost() + 2;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", sữa";
    }
}
