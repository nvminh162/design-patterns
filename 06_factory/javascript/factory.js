
// create service car
class Car {
    constructor({ name = "Ford Ranger 2023", doors = 4, price = '10 VND', customerInfo = {} }) {
        this.name = name;
        this.doors = doors;
        this.price = price;
        this.customerInfo = customerInfo;
    }
}

// create service logistics
class ServiceLogistics {
    transportClass = Car
    getTransport = (customerInfo) => {
        return new this.transportClass(customerInfo);
    }
}

// Order for customer by Car
const carService = new ServiceLogistics();
console.log('>>> Car service::: ', carService.getTransport({ customerInfo: { name: 'nvminh162', cargoVolume: '100kg' } }));

// ========================================================

// Cách 1:
// create new service
class Truck {
    constructor({ name = "Container 2023", doors = 16, price = '100 VND', customerInfo = {} }) {
        this.name = name;
        this.doors = doors;
        this.price = price;
        this.customerInfo = customerInfo;
    }
}
carService.transportClass = Truck
console.log("C1: Truck service::: ", carService.getTransport({ customerInfo: { name: "nvminh1602", cargoVolume: "1000kg" } }));

// Cách 2:
class TruckService extends ServiceLogistics {
    transportClass = Truck
}
const truckService = new TruckService();
console.log('C2: Truck service::: ', truckService.getTransport({ customerInfo: { name: "Nguyen Van Minh", cargoVolume: '9999kg' } }) );
