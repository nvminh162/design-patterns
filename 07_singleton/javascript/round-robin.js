'use strict';

/* 
==================== MODULUS ====================
Ý tưởng:
- Lấy phần dư (%)
- Dùng phần dư làm index server (0 → n-1)
- Giúp phân phối user vào các server
*/
console.log(`----------------------------------------`);
console.log(`Thuật toán modulus`);

const numServer = 3; // có 3 server: 0, 1, 2

// giả lập các userId
const userId1 = 100076;
const userId2 = 100079;
const userId3 = 100078;
const userId4 = 565778;

// % numServer → trả về server index
console.log(userId1 % numServer); // → 2 (server 2)
console.log(userId2 % numServer); // → 2 (server 2)
console.log(userId3 % numServer); // → 1 (server 1)
console.log(userId4 % numServer); // → 1 (server 1)

console.log(`----------------------------------------`);
console.log(`++++++++++++++++++++++++++++++++++++++++`);

/* 
==================== ROUND ROBIN + SINGLETON ====================

Round Robin:
- Phân request theo thứ tự vòng tròn
- Ví dụ: 1 → 2 → 3 → 1 → 2 → 3 ...

Singleton:
- Chỉ tạo 1 instance duy nhất
- Mọi lần new sau đều dùng lại instance cũ
*/

class RoundRobin {
    constructor() {
        /*
        this = object mới được tạo bởi "new"

        Lần 1:
            RoundRobin.instance chưa tồn tại → tạo mới

        Lần 2:
            RoundRobin.instance đã có → return lại object cũ
            → KHÔNG dùng object mới tạo nữa
        */
        if (RoundRobin.instance) {
            return RoundRobin.instance;
        }

        // lưu instance đầu tiên vào class (dùng chung về sau)
        RoundRobin.instance = this;

        // danh sách server
        this.servers = [];

        // vị trí server hiện tại (index)
        this.index = 0;
    }

    // thêm server vào danh sách
    addServer(server) {
        this.servers.push(server);
    }

    // lấy server tiếp theo theo kiểu xoay vòng
    getNextServer() {
        // check đúng: nếu không có server thì báo lỗi
        if (this.servers.length === 0) {
            throw new Error('No server available!');
        }

        // lấy server hiện tại
        const server = this.servers[this.index];

        /*
        tăng index + quay vòng bằng modulus

        ví dụ:
        index = 0 → 1 → 2 → (2+1)%3 = 0 → quay lại đầu
        */
        this.index = (this.index + 1) % this.servers.length;

        return server;
    }
}

/* 
Singleton demo:

Lần 1:
    tạo object thật

Lần 2:
    không dùng object mới
    → return object cũ
*/
const loadBalancer = new RoundRobin(); 
const loadBalancer1 = new RoundRobin(); 

console.log(`----------------------------------------`);

// true → vì cùng 1 object
console.log(`compare:: ${loadBalancer === loadBalancer1}`);

// thêm server
loadBalancer.addServer(`Server 01`);
loadBalancer.addServer(`Server 02`);
loadBalancer.addServer(`Server 03`);

/*
Round Robin chạy như sau:

Server 01 → Server 02 → Server 03 → Server 01 → ...
*/
console.log(loadBalancer.getNextServer()); // Server 01
console.log(loadBalancer.getNextServer()); // Server 02
console.log(loadBalancer.getNextServer()); // Server 03
console.log(loadBalancer.getNextServer()); // Server 01
console.log(loadBalancer.getNextServer()); // Server 02
console.log(loadBalancer.getNextServer()); // Server 03
console.log(loadBalancer.getNextServer()); // Server 01

console.log(`----------------------------------------`);