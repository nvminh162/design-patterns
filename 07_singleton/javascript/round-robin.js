'use-strict';

/* 
Lấy phần dư
Và dùng phần dư đó làm index server
*/
console.log(`----------------------------------------`);
console.log(`Thuật toán modulus`);
const numServer = 3;
const userId1 = 100076;
const userId2 = 100079;
const userId3 = 100078;
const userId4 = 565778;
console.log(userId1 % numServer); // lấy số dư chính là server
console.log(userId2 % numServer); // lấy số dư chính là server
console.log(userId3 % numServer); // lấy số dư chính là server
console.log(userId4 % numServer); // lấy số dư chính là server
console.log(`----------------------------------------`);

console.log(`++++++++++++++++++++++++++++++++++++++++`);

/* 
    THHUẬT TOÁN ROUNDROBIN SỪ DỤNG SINGLETON
*/
class RoundRobin {
    constructor() {
        // nếu tồn tại rồi thì trả về this, không đi xuống this. this.
        if (RoundRobin.instance) {
            return RoundRobin.instance;
        } 
        RoundRobin.instance = this;
        this.servers = [];
        this.index = 0;
    }

    // add server (method: giúp add máy chủ vào danh sách máy chủ để sẵn sàng cân bằng tải)
    addServer(server) {
        this.servers.push(server);
    }

    // get next server (method: trả về máy chủ tiếp theo trong dnah sách kiểu vòng tròn)
    getNextServer() {
        if (!this.servers.length === 0) {
            throw new Error('No server available!');
        }
        const server = this.servers[this.index];
        // modulusS
        this.index = (this.index + 1) % this.servers.length;
        return server;
    }
}

const loadBalancer = new RoundRobin();
const loadBalancer1 = new RoundRobin();
console.log(`----------------------------------------`);
console.log(`compare:: ${loadBalancer === loadBalancer1}`);
loadBalancer.addServer(`Server 01`)
loadBalancer.addServer(`Server 02`)
loadBalancer.addServer(`Server 03`)
console.log(loadBalancer.getNextServer()); // expect => Server 01
console.log(loadBalancer.getNextServer()); // expect => Server 02
console.log(loadBalancer.getNextServer()); // expect => Server 03
console.log(loadBalancer.getNextServer()); // expect => Server 01
console.log(loadBalancer.getNextServer()); // expect => Server 02
console.log(loadBalancer.getNextServer()); // expect => Server 03
console.log(loadBalancer.getNextServer()); // expect => Server 01
console.log(`----------------------------------------`);
