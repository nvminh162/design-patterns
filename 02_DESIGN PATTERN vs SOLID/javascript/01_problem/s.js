
class Asset {
    // cho phép user mua bằng vàng
    buyItem(asset) {
        console.log(`Mua ${asset} bằng vàng`);
    }
}

class Client {
    static buy() {
        const asset = new Asset();
        asset.buyItem("house");
        asset.buyItem("car");
        asset.buyItem("stock");
    }
}

Client.buy();
