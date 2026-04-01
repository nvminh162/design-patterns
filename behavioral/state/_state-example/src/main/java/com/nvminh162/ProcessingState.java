package com.nvminh162;

public class ProcessingState implements VendingMachineState {

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Đang xử lý, không thể chèn tiền thêm.");
    }

    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("Sản phẩm đang được chuẩn bị...");
        machine.dispenseProduct();
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        System.out.println("Sản phẩm đã được lấy ra!");
        machine.setState(new ReadyState());
    }
}
