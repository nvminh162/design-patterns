class AssetGold {
    public void buyItem(String asset) {
        System.out.println("Mua " + asset + " bang vang");
    }
}

class AssetCash {
    public void buyItem(String asset) {
        System.out.println("Mua " + asset + " bang tien");
    }
}

public class Main2 {
    public static void main(String[] args) {
        AssetGold assetGold = new AssetGold();
        assetGold.buyItem("house");
        assetGold.buyItem("car");
        assetGold.buyItem("stock");

        System.out.println("-----------------------------");

        AssetCash assetCash = new AssetCash();
        assetCash.buyItem("fly");
        assetCash.buyItem("iphone");
        assetCash.buyItem("macbook");
    }
}
