class Socket {
  constructor(tivi, fridge, fan) {
    this.tivi = tivi;
    this.fridge = fridge;
    this.fan = fan;
  }

  activate() {
    console.log("Connect to Socket");
    this.tivi.connectTivi();
    this.fridge.connectFridge();
    this.fan.connectFan();
  }
}

module.exports = Socket;