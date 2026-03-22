class Socket {
  constructor(tivi, fridge) {
    this.tivi = tivi;
    this.fridge = fridge;
  }

  activate() {
    console.log("Connect to Socket");
    this.tivi.connectTivi();
    this.fridge.connectFridge();
  }
}

module.exports = Socket;