const Tivi = require('./Tivi');
const Fridge = require('./Fridge');
const Fan = require('./Fan');
const Socket = require('./Socket');

// test
const socket = new Socket();

socket.addDevice(new Tivi());
socket.addDevice(new Fridge());
socket.addDevice(new Fan());

socket.activate();
