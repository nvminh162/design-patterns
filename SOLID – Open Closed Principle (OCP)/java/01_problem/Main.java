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
Socket class
===============================
*/
class Socket {
    private Tivi tivi;
    private Fridge fridge;

    public Socket(Tivi tivi, Fridge fridge) {
        this.tivi = tivi;
        this.fridge = fridge;
    }

    public void activate() {
        System.out.println("Connect to Socket");
        tivi.connectTivi();
        fridge.connectFridge();
    }
}

/*
===============================
MAIN class
===============================
*/
public class Main {
    public static void main(String[] args) {
        Socket socket = new Socket(new Tivi(), new Fridge());
        socket.activate();
    }
}
