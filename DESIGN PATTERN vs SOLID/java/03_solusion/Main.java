interface PaymentMethod {
    boolean canBuy(String asset);
    void buy(String asset);
}

class GoldPayment implements PaymentMethod {
    @Override
    public boolean canBuy(String asset) {
        return "house".equals(asset) || "car".equals(asset) || "stock".equals(asset);
    }

    @Override
    public void buy(String asset) {
        System.out.println("Mua " + asset + " bang vang");
    }
}

class CashPayment implements PaymentMethod {
    @Override
    public boolean canBuy(String asset) {
        return "fly".equals(asset) || "iphone".equals(asset) || "macbook".equals(asset);
    }

    @Override
    public void buy(String asset) {
        System.out.println("Mua " + asset + " bang tien");
    }
}

class AssetBuyer {
    private final PaymentMethod[] paymentMethods;

    AssetBuyer(PaymentMethod... paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public void buyItem(String asset) {
        for (PaymentMethod paymentMethod : paymentMethods) {
            if (paymentMethod.canBuy(asset)) {
                paymentMethod.buy(asset);
                return;
            }
        }

        System.out.println("Khong ho tro mua " + asset);
    }
}

public class Main {
    public static void main(String[] args) {
        AssetBuyer buyer = new AssetBuyer(new GoldPayment(), new CashPayment());

        buyer.buyItem("house");
        buyer.buyItem("car");
        buyer.buyItem("stock");
        buyer.buyItem("fly");
        buyer.buyItem("iphone");
        buyer.buyItem("macbook");
        buyer.buyItem("bcs");
    }
}
