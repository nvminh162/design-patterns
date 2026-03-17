const Tivi = require('./Tivi');
const Fridge = require('./Fridge');
const Socket = require('./ocp');
const Fan = require('./Fan');

// test
const socket = new Socket(new Tivi(), new Fridge(), new Fan());
socket.activate();
