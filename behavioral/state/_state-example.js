
// State Interface - Định nghĩa hành vi cho các trạng thái
class VendingMachineState {
  insertCoin(machine) {}
  selectProduct(machine) {}
  dispenseProduct(machine) {}
}

// Các trạng thái cụ thể
class ReadyState extends VendingMachineState {
  insertCoin(machine) {
    console.log("Tiền đã được chèn.");
    machine.setState(new ProcessingState());
  }

  selectProduct(machine) {
    console.log("Vui lòng chèn tiền trước.");
  }

  dispenseProduct(machine) {
    console.log("Vui lòng chèn tiền và chọn sản phẩm.");
  }
}

class ProcessingState extends VendingMachineState {
  selectProduct(machine) {
    console.log("Sản phẩm đang được chuẩn bị...");
    machine.dispenseProduct();
  }

  dispenseProduct(machine) {
    console.log("Sản phẩm đã được lấy ra!");
    machine.setState(new ReadyState());
  }

  insertCoin(machine) {
    console.log("Đang xử lý, không thể chèn tiền thêm.");
  }
}

class OutOfServiceState extends VendingMachineState {
  insertCoin(machine) {
    console.log("Máy bán hàng không hoạt động.");
  }

  selectProduct(machine) {
    console.log("Máy bán hàng không hoạt động.");
  }

  dispenseProduct(machine) {
    console.log("Máy bán hàng không hoạt động.");
  }
}

// Context - Máy bán hàng
class VendingMachine {
  constructor() {
    this.state = new ReadyState(); // Bắt đầu ở trạng thái sẵn sàng
  }

  setState(state) {
    this.state = state;
  }

  insertCoin() {
    this.state.insertCoin(this);
  }

  selectProduct() {
    this.state.selectProduct(this);
  }

  dispenseProduct() {
    this.state.dispenseProduct(this);
  }
}

// Sử dụng State Pattern
const vendingMachine = new VendingMachine();

vendingMachine.insertCoin(); // Tiền đã được chèn.
vendingMachine.selectProduct(); // Sản phẩm đang được chuẩn bị...
// Output: Sản phẩm đã được lấy ra!

vendingMachine.insertCoin(); // Tiền đã được chèn.
vendingMachine.insertCoin(); // Đang xử lý, không thể chèn tiền thêm.

