package com.nvminh162;

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
