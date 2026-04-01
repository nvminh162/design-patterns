package com.nvminh162;

public interface VendingMachineState {
    void insertCoin(VendingMachine machine);

    void selectProduct(VendingMachine machine);

    void dispenseProduct(VendingMachine machine);
}
