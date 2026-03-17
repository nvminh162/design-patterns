import java.util.ArrayList;
import java.util.List;

/* 
===============================
Deveices interface
===============================
*/
interface Devices {
    void connect();
}

/*
 * ===============================
 * Tivi class
 * ===============================
 */
class Tivi implements Devices {

    @Override
    public void connect() {
        System.out.println("Tivi connected");
    }
    
}

/*
 * ===============================
 * Fridge class
 * ===============================
 */
class Fridge implements Devices {
 
    @Override
    public void connect() {
        System.out.println("Fridge connected");
    }
}

/*
 * ===============================
 * Fan class
 * ===============================
 */
class Fan implements Devices {

    @Override
    public void connect() {
        System.out.println("Fan connected");
    }
    
}

/*
 * ===============================
 * Socket class
 * ===============================
 */
class Socket {
    private List<Devices> devices;

    public Socket() {
        devices = new ArrayList<>();
    }

    public void addDevice(Devices device) {
        devices.add(device);
    }

    public void activate() {
        System.out.println("Connect to Socket");
        devices.forEach(device -> device.connect());
    }
}

/*
 * ===============================
 * MAIN class
 * ===============================
 */
public class Main {
    public static void main(String[] args) {
        Socket socket = new Socket();
        socket.addDevice(new Tivi()); 
        socket.addDevice(new Fridge()); 
        socket.addDevice(new Fan()); 
        socket.activate();
    }
}
