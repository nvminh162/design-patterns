class Asset {
  // cho phép user mua bằng vàng và tiền
  buyItem(asset) {
    if (asset === "house") {
      console.log(`Mua ${asset} bằng vàng`);
    }
    if (asset === "car") {
      console.log(`Mua ${asset} bằng vàng`);
    }
    if (asset === "stock") {
      console.log(`Mua ${asset} bằng vàng`);
    }
    if (asset === "fly") {
      console.log(`Mua ${asset} bằng tiền`);
    }
    if (asset === "iphone") {
      console.log(`Mua ${asset} bằng tiền`);
    }
    if (asset === "macbook") {
      console.log(`Mua ${asset} bằng tiền`);
    }
  }
}

class Client {
  static buy() {
    const asset = new Asset();
    asset.buyItem("house");
    asset.buyItem("car");
    asset.buyItem("stock");
    asset.buyItem("fly");
    asset.buyItem("iphone");
    asset.buyItem("macbook");
    asset.buyItem("bcs");
  }
}

Client.buy();
