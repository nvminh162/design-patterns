class Observer {
  constructor(name) {
    this.namePick = name;
  }

  goToHelp(location) {
    console.log(`${this.namePick} PING ${JSON.stringify(location)}`);
  }

  updateStatus(location) {
    this.goToHelp(location);
  }
}

class Subject {
  constructor() {
    this.observerList = [];
  }

  addObserver(observer) {
    this.observerList.push(observer);
  }

  notify(location) {
    this.observerList.forEach((observer) => observer.updateStatus(location));
  }
}

const subject = new Subject();

// your pick: Yasuo, Leesin, Yumi
const yasuo = new Observer("Yasuo");
const lessin = new Observer("Leesin");
const yumi = new Observer("Yumi");

// add Yasuo & Leesin
subject.addObserver(yasuo);
subject.addObserver(lessin);
subject.addObserver(yumi);

//push location to team
subject.notify({ long: 123, lat: 123 });
