class Asset {
    public void buyItem(String asset) {
        System.out.println("Mua " + asset + " bang vang");
    }
}

public class Main {
    public static void main(String[] args) {
        Asset asset = new Asset();
        asset.buyItem("house");
        asset.buyItem("car");
        asset.buyItem("stock");
    }
}
