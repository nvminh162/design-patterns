package com.nvminh162;

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
