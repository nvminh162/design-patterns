class Asset {
  // cho phép user mua bằng vàng
  buyItemGold(asset) {
    if (asset === "house") {
      console.log(`Mua ${asset} bằng vàng`);
    }
    if (asset === "car") {
      console.log(`Mua ${asset} bằng vàng`);
    }
    if (asset === "stock") {
      console.log(`Mua ${asset} bằng vàng`);
    }
  }

  // cho phép user mua bằng tiền
  buyItemCash(asset) {
    if (asset === "fly") {
      console.log(`Mua ${asset} bằng tiền VND`);
    }
    if (asset === "iphone") {
      console.log(`Mua ${asset} bằng tiền USD`);
    }
    if (asset === "macbook") {
      console.log(`Mua ${asset} bằng tiền BITCOIN`);
    }
  }
}

class Client {
  static buy() {
    const asset = new Asset();
    asset.buyItemGold("house");
    asset.buyItemGold("car");
    asset.buyItemGold("stock");
    asset.buyItemCash("fly");
    asset.buyItemCash("iphone");
    asset.buyItemCash("macbook");
    asset.buyItemCash("bcs");
  }
}

Client.buy();
