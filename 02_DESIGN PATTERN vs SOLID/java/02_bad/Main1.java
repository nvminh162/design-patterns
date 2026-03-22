class Asset {
    public void buyItem(String asset) {
        if ("house".equals(asset) || "car".equals(asset) || "stock".equals(asset)) {
            System.out.println("Mua " + asset + " bang vang");
        }

        if ("fly".equals(asset) || "iphone".equals(asset) || "macbook".equals(asset)) {
            System.out.println("Mua " + asset + " bang tien");
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        Asset asset = new Asset();
        asset.buyItem("house");
        asset.buyItem("car");
        asset.buyItem("stock");
        asset.buyItem("fly");
        asset.buyItem("iphone");
        asset.buyItem("macbook");
        asset.buyItem("bcs");
    }
}
