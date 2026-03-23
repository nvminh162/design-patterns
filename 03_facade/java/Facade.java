public class Facade {
    public static void buy(double price) {
        FacadeShopee shopee = new FacadeShopee();
        System.out.println("Price final: " + shopee.calc(price));
    }
    public static void main(String[] args) {
        buy(120000);
    }
}

class Discount {
    public double calc(double value) {
        return value * 0.9;
    }
}

class Shipping {
    public double calc(double value) {
        return 5;
    }
}

class Fees {
    public double calc(double value) {
        return value * 1.05;
    }
}

class FacadeShopee {

    private Discount discount;
    private Fees fees;
    private Shipping shipping;

    public FacadeShopee() {
        this.discount = new Discount();
        this.shipping = new Shipping();
        this.fees = new Fees();
    }

    public double calc(double price) {
        price = this.discount.calc(price);
        System.out.println("discount calc: " + price);
        price = this.fees.calc(price);
        System.out.println("fees calc: " + price);
        price += this.shipping.calc(price);
        System.out.println("shipping calc: " + price);
        System.out.println("===================================");
        return price;
    }
}
