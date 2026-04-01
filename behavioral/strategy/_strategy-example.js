
// Strategy Interface - Định nghĩa phương thức thanh toán
class PaymentStrategy {
  pay(amount) {}
}

// Các chiến lược cụ thể
class CreditCardPayment extends PaymentStrategy {
  pay(amount) {
    console.log(`Thanh toán bằng thẻ tín dụng: ${amount} đô la.`);
  }
}

class PayPalPayment extends PaymentStrategy {
  pay(amount) {
    console.log(`Thanh toán bằng PayPal: ${amount} đô la.`);
  }
}

class BitcoinPayment extends PaymentStrategy {
  pay(amount) {
    console.log(`Thanh toán bằng Bitcoin: ${amount} đô la.`);
  }
}

// Context - Lớp xử lý thanh toán
class ShoppingCart {
  constructor() {
    this.items = [];
    this.paymentStrategy = null; // Chiến lược thanh toán
  }

  addItem(item) {
    this.items.push(item);
  }

  setPaymentStrategy(strategy) {
    this.paymentStrategy = strategy;
  }

  checkout() {
    const totalAmount = this.items.reduce((total, item) => total + item.price, 0);
    console.log(`Tổng số tiền: ${totalAmount} đô la.`);
    this.paymentStrategy.pay(totalAmount);
  }
}

// Sử dụng Strategy Pattern
const cart = new ShoppingCart();
cart.addItem({ name: "Sách", price: 20 });
cart.addItem({ name: "Bút", price: 5 });

// Chọn phương thức thanh toán
cart.setPaymentStrategy(new CreditCardPayment());
cart.checkout(); // Thanh toán bằng thẻ tín dụng: 25 đô la.

cart.setPaymentStrategy(new PayPalPayment());
cart.checkout(); // Thanh toán bằng PayPal: 25 đô la.

cart.setPaymentStrategy(new BitcoinPayment());
cart.checkout(); // Thanh toán bằng Bitcoin: 25 đô la.

