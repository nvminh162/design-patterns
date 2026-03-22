const Tivi = require('./Tivi');
const Fridge = require('./Fridge');
const Fan = require('./Fan');
const Socket = require('./Socket');

// test
const socket = new Socket(new Tivi(), new Fridge(), new Fan());
socket.activate();
