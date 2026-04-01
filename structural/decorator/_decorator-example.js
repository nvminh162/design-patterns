// Component cơ bản - Cà phê
class Coffee {
  getCost() {
    return 10;
  }

  getDescription() {
    return "Cà phê";
  }
}

// Decorator cơ bản
class CoffeeDecorator {
  constructor(coffee) {
    this.coffee = coffee;
  }

  getCost() {
    return this.coffee.getCost();
  }

  getDescription() {
    return this.coffee.getDescription();
  }
}

// Concrete Decorator - Thêm sữa
class MilkDecorator extends CoffeeDecorator {
  getCost() {
    return this.coffee.getCost() + 2; // Thêm chi phí sữa
  }

  getDescription() {
    return this.coffee.getDescription() + ", sữa";
  }
}

// Concrete Decorator - Thêm đường
class SugarDecorator extends CoffeeDecorator {
  getCost() {
    return this.coffee.getCost() + 1; // Thêm chi phí đường
  }

  getDescription() {
    return this.coffee.getDescription() + ", đường";
  }
}

// Sử dụng Decorator Pattern
let myCoffee = new Coffee();
myCoffee = new MilkDecorator(myCoffee); // Thêm sữa
myCoffee = new SugarDecorator(myCoffee); // Thêm đường

console.log(myCoffee.getDescription()); // Output: "Cà phê, sữa, đường"
console.log(`Giá: ${myCoffee.getCost()} VNĐ`); // Output: 13 VNĐ

