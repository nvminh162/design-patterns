package com.nvminh162;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine.insertCoin();
        machine.selectProduct();

        machine.insertCoin();
        machine.insertCoin();
    }
}
