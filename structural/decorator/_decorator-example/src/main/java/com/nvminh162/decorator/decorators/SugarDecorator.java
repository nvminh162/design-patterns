package com.nvminh162.decorator.decorators;

import com.nvminh162.decorator.core.Coffee;
import com.nvminh162.decorator.core.CoffeeDecorator;

// Concrete Decorator - Thêm đường
public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost() {
        return super.getCost() + 1;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", đường";
    }
}
