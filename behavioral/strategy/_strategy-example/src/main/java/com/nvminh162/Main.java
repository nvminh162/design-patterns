package com.nvminh162;

import com.nvminh162.context.ShoppingCart;
import com.nvminh162.model.Item;
import com.nvminh162.strategy.BitcoinPayment;
import com.nvminh162.strategy.CreditCardPayment;
import com.nvminh162.strategy.PayPalPayment;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new Item("Sách", 20));
        cart.addItem(new Item("Bút", 5));

        // Chọn phương thức thanh toán
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout();

        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout();

        cart.setPaymentStrategy(new BitcoinPayment());
        cart.checkout();
    }
}
