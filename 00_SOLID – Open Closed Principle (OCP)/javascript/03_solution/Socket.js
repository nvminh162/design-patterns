class Socket {
  constructor() {
    this.devices = [];
  }

  addDevice(device) {
    this.devices.push(device);
  }

  activate() {
    console.log("Connect to Socket");
    this.devices.forEach((device) => device.connect());
  }
}

module.exports = Socket;