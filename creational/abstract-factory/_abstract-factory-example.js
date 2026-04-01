// Abstract Factory
class AbstractFactory {
  createLight() {}
  createFan() {}
}

// Factory cho thị trường Mỹ
class USFactory extends AbstractFactory {
  createLight() {
    return new USLight();
  }
  createFan() {
    return new USFan();
  }
}

// Factory cho thị trường Châu Âu
class EUFactory extends AbstractFactory {
  createLight() {
    return new EULight();
  }
  createFan() {
    return new EUFan();
  }
}

// Các sản phẩm cho thị trường Mỹ
class USLight {
  turnOn() {
    console.log('Turning on US light.');
  }
}
class USFan {
  turnOn() {
    console.log('Turning on US fan.');
  }
}

// Các sản phẩm cho thị trường Châu Âu
class EULight {
  turnOn() {
    console.log('Turning on EU light.');
  }
}
class EUFan {
  turnOn() {
    console.log('Turning on EU fan.');
  }
}

// Sử dụng Abstract Factory
function client(factory) {
  const light = factory.createLight();
  const fan = factory.createFan();

  light.turnOn();
  fan.turnOn();
}

// Tạo Factory cho thị trường Mỹ
const usFactory = new USFactory();
client(usFactory); // Output: Turning on US light. Turning on US fan.

// Tạo Factory cho thị trường Châu Âu
const euFactory = new EUFactory();
client(euFactory); // Output: Turning on EU light. Turning on EU fan.

