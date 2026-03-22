const Tivi = require('./Tivi');
const Fridge = require('./Fridge');
const Socket = require('./Socket');

// test
const socket = new Socket(new Tivi(), new Fridge());
socket.activate();
