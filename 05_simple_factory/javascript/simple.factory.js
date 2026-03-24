class ServiceLogistics {

    constructor(doors = 6, price = '100.000đ', name = 'Truck 10') {
        this.name = name;
        this.doors = doors;
        this.price = price;
    }

    static getTransport = (cargoVolume) => {
        switch(cargoVolume) {
            case 10:
                return new ServiceLogistics();
            case 20:
                return new ServiceLogistics(16, '1.000.000đ', 'Truck 20')
        }
    }
}

console.log(ServiceLogistics.getTransport(10));
console.log(ServiceLogistics.getTransport(20));

/* 
    Advantages:
=> Cung cấp cơ chế đặc biệt tạo đối tượng, tách biệt việc tạo đối tượng và sử dụng đối tượng
*/

/* 
    Disadvantages:
=> Tập tung tính logic tạo sản phẩm, trách nhiệm hàm rất nặng nề, nếu hàm có vấn đề thì hệ thống sẽ không chạy được (khó mở rộng) 
*/