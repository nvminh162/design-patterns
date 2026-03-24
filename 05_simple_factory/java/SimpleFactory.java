
public class SimpleFactory {
    public static void main(String[] args) {
        System.out.println(ServiceLogistics.getTransport(10));
        System.out.println(ServiceLogistics.getTransport(20));
    }
}

class ServiceLogistics {

    private String name;
    private int doors;
    private String price;

    public ServiceLogistics() {
        this("Truck 10", 6, "100.000");
    }

    public ServiceLogistics(String name, int doors, String price) {
        this.name = name;
        this.doors = doors;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ServiceLogistics [name=" + name + ", doors=" + doors + ", price=" + price + "]";
    }

    public static ServiceLogistics getTransport(int cargoVolume) {
        switch (cargoVolume) {
            case 10:
                return new ServiceLogistics();
            case 20:
                return new ServiceLogistics("Truck 20", 16, "1.000.000");
            default:
                return null;
        }
    }
}
