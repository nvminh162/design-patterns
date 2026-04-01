package com.nvminh162;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();
    private PaymentStrategy paymentStrategy;

    public void addItem(Item item) {
        items.add(item);
    }

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void checkout() {
        double totalAmount = 0;

        for (Item item : items) {
            totalAmount += item.price;
        }

        System.out.println("Tổng số tiền: " + totalAmount + " đô la.");

        if (paymentStrategy == null) {
            throw new IllegalStateException("Chưa chọn phương thức thanh toán!");
        }

        paymentStrategy.pay(totalAmount);
    }
}
