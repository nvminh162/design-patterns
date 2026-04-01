package com.nvminh162;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        System.out.println("============");
        machine.selectProduct();
        System.out.println("============");
        machine.insertCoin();
        System.out.println("============");
        machine.selectProduct();
        System.out.println("============");
        machine.insertCoin();
        System.out.println("============");
        machine.insertCoin();
        System.out.println("============");
    }
}
