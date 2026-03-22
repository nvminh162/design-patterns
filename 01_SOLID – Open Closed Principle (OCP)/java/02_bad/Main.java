/* 
===============================
Tivi class
===============================
*/
class Tivi {
    public void connectTivi() {
        System.out.println("Tivi connected");
    }
}

/*
===============================
Fridge class
===============================
*/
class Fridge {
    public void connectFridge() {
        System.out.println("Fridge connected");
    }
}

/*
===============================
Fan class
===============================
*/
class Fan {
    public void connectFan() {
        System.out.println("Fan connected");
    }
}

/*
===============================
Socket class
===============================
*/
class Socket {
    private Tivi tivi;
    private Fridge fridge;
    private Fan fan;

    public Socket(Tivi tivi, Fridge fridge, Fan fan) {
        this.tivi = tivi;
        this.fridge = fridge;
        this.fan = fan;
    }

    public void activate() {
        System.out.println("Connect to Socket");
        tivi.connectTivi();
        fridge.connectFridge();
        fan.connectFan();
    }
}

/*
===============================
MAIN class
===============================
*/
public class Main {
    public static void main(String[] args) {
        Socket socket = new Socket(new Tivi(), new Fridge(), new Fan());
        socket.activate();
    }
}
