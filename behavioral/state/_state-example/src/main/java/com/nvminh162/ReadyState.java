package com.nvminh162;

public class ReadyState implements VendingMachineState {

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Tiền đã được chèn.");
        machine.setState(new ProcessingState());
    }

    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("Vui lòng chèn tiền trước.");
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        System.out.println("Vui lòng chèn tiền và chọn sản phẩm.");
    }
}
