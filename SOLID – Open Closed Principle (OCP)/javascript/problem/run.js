const Tivi = require('./Tivi');
const Fridge = require('./Fridge');
const Socket = require('./ocp');

// test
const socket = new Socket(new Tivi(), new Fridge());
socket.activate();
