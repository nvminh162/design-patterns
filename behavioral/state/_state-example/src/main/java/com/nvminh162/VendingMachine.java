package com.nvminh162;

public class VendingMachine {
    private VendingMachineState state;

    public VendingMachine() {
        this.state = new ReadyState();
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public void insertCoin() {
        state.insertCoin(this);
    }

    public void selectProduct() {
        state.selectProduct(this);
    }

    public void dispenseProduct() {
        state.dispenseProduct(this);
    }
}
