const serviceLogistics = (cargoVolume) => {
  switch (cargoVolume) {
    case 10:
      return {
        name: "Truck 10",
        doors: 6,
        price: "100.000đ ",
      };
    case 20:
      return {
        name: "Truck 20",
        doors: 16,
        price: "1.000.000đ ",
      };
  }
};

console.log(serviceLogistics(10));
console.log(serviceLogistics(20));
