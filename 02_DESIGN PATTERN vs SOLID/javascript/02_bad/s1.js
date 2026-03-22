
class AssetGold {
    // cho phép user mua bằng vàng
    buyItem(asset) {
        console.log(`Mua ${asset} bằng vàng`);
    }
}

class AssetCash {
    // cho phép user mua bằng tiền
    buyItem(asset) {
        console.log(`Mua ${asset} bằng tiền`);
    }
}

class Client {
    static buy() {
        const assetGold = new AssetGold();
        assetGold.buyItem("house");
        assetGold.buyItem("car");
        assetGold.buyItem("stock");
        console.log(`-----------------------------`);
        const assetCash = new AssetCash();
        assetCash.buyItem("fly");
        assetCash.buyItem("iphone");
        assetCash.buyItem("macbook");
    }
}

Client.buy();
