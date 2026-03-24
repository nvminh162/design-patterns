public class SimpleFactoryWithout {

    public static void main(String[] args) {
        System.out.println(serviceLogistics(10));
        System.out.println(serviceLogistics(20));
    }

    public static CargoVolume serviceLogistics(int cargoVolume) {
        switch (cargoVolume) {
            case 10:
                return new CargoVolume("Truck 10", 6, "100.000");
            case 20:
                return new CargoVolume("Truck 20", 16, "1.000.000");
            default:
                return null;
        }
    }

}

class CargoVolume {
    private String name;
    private int doors;
    private String price;

    public CargoVolume(String name, int doors, String price) {
        this.name = name;
        this.doors = doors;
        this.price = price;
    }

    @Override
    public String toString() {
        return "CargoVolume [name=" + name + ", doors=" + doors + ", price=" + price + "]";
    }
}