package com.nvminh162;

public class OutOfServiceState implements VendingMachineState {

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Máy bán hàng không hoạt động.");
    }

    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("Máy bán hàng không hoạt động.");
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        System.out.println("Máy bán hàng không hoạt động.");
    }
}
