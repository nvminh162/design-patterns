package com.nvminh162;

public class BitcoinPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán bằng Bitcoin: " + amount + " đô la.");
    }
}
