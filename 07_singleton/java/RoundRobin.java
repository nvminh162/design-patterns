import java.util.ArrayList;
import java.util.List;

public class RoundRobin {

    public static void main(String[] args) {

        /*
        ==================== MODULUS ====================
        */
        System.out.println("----------------------------------------");
        System.out.println("Thuật toán modulus");

        int numServer = 3;

        int userId1 = 100076;
        int userId2 = 100079;
        int userId3 = 100078;
        int userId4 = 565778;

        // % → lấy phần dư = server index
        System.out.println(userId1 % numServer); // 2
        System.out.println(userId2 % numServer); // 2
        System.out.println(userId3 % numServer); // 1
        System.out.println(userId4 % numServer); // 1

        System.out.println("----------------------------------------");
        System.out.println("++++++++++++++++++++++++++++++++++++++++");


        /*
        ==================== ROUND ROBIN + SINGLETON ====================
        */
        RoundRobinSingleton loadBalancer = RoundRobinSingleton.getInstance();
        RoundRobinSingleton loadBalancer1 = RoundRobinSingleton.getInstance();

        System.out.println("----------------------------------------");

        // true → cùng 1 instance
        System.out.println("compare:: " + (loadBalancer == loadBalancer1));

        loadBalancer.addServer("Server 01");
        loadBalancer.addServer("Server 02");
        loadBalancer.addServer("Server 03");

        System.out.println(loadBalancer.getNextServer()); // Server 01
        System.out.println(loadBalancer.getNextServer()); // Server 02
        System.out.println(loadBalancer.getNextServer()); // Server 03
        System.out.println(loadBalancer.getNextServer()); // Server 01
        System.out.println(loadBalancer.getNextServer()); // Server 02
        System.out.println(loadBalancer.getNextServer()); // Server 03
        System.out.println(loadBalancer.getNextServer()); // Server 01

        System.out.println("----------------------------------------");
    }
}

/*
Singleton + Round Robin
*/
class RoundRobinSingleton {

    // Singleton: instance duy nhất
    private static RoundRobinSingleton instance;

    private List<String> servers;
    private int index;

    // constructor private → không cho new bên ngoài
    private RoundRobinSingleton() {
        this.servers = new ArrayList<>();
        this.index = 0;
    }

    // lấy instance duy nhất
    public static RoundRobinSingleton getInstance() {
        if (instance == null) {
            instance = new RoundRobinSingleton();
        }
        return instance;
    }

    // thêm server
    public void addServer(String server) {
        servers.add(server);
    }

    // lấy server tiếp theo (round robin)
    public String getNextServer() {
        if (servers.size() == 0) {
            throw new RuntimeException("No server available!");
        }

        String server = servers.get(index);

        // modulus → quay vòng
        index = (index + 1) % servers.size();

        return server;
    }
}