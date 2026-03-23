class Discount {
  calc(value) {
    return value * 0.9;
  }
}

class Shipping {
  calc() {
    return 5;
  }
}

class Fees {
  calc(value) {
    return value * 1.05;
  }
}

class ShopeeFacadePattern {
  constructor() {
    this.discount = new Discount();
    this.shipping = new Shipping();
    this.fees = new Fees();
  }

  calc(price) {
    price = this.discount.calc(price);
    console.log(`discount calc: ${price}đ`);
    price = this.fees.calc(price);
    console.log(`fees calc: ${price}đ`);
    price += this.shipping.calc(price);
    console.log(`shipping calc: ${price}đ`);
    console.log('===================================');
    return price;
  }
}

const buy = (price) => {
  const shopee = new ShopeeFacadePattern();
  console.log(`Price final: ${shopee.calc(price)}đ`);
};

buy(120000);
