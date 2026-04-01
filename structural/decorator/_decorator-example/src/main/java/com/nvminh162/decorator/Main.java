package com.nvminh162.decorator;

import com.nvminh162.decorator.component.BasicCoffee;
import com.nvminh162.decorator.core.Coffee;
import com.nvminh162.decorator.decorators.MilkDecorator;
import com.nvminh162.decorator.decorators.SugarDecorator;

// Main class
public class Main {
    public static void main(String[] args) {
        Coffee myCoffee = new BasicCoffee();

        myCoffee = new MilkDecorator(myCoffee);   // Thêm sữa
        myCoffee = new SugarDecorator(myCoffee);  // Thêm đường

        System.out.println(myCoffee.getDescription()); // Cà phê, sữa, đường
        System.out.println("Giá: " + myCoffee.getCost() + " VNĐ"); // 13 VNĐ
    }
}
