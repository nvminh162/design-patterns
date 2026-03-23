// SẾP: người quyết định mọi việc nhận request cuối
class Leader {
  receiveRequest(offer) {
    if (offer > 10000) {
        console.log(`Reject: ${offer}`);
    } else {
        console.log(`Accept:  ${offer}`);
    }
  }
}

// THƯ KÝ: người được uỷ quyền bởi SẾP
class Secretary {
  constructor() {
    this.leader = new Leader();
  }

  receiveRequest(offer) {
    // Khi THƯ KÝ nhận mọi request thì SẾP là người nhận được câu hỏi và giải quyết
    this.leader.receiveRequest(offer);
  }
}

// DEVELOPER: người tạo ra yêu cầu offer gửi đến SẾP nhưng thông qua THƯ KÝ của SẾP
class Developer {
  constructor(offer) {
    this.offer = offer;
  }

  // DEVELOPER: gửi đến THƯ KÝ
  applyFor(target) {
    target.receiveRequest(this.offer);
  }
}

const dev01 = new Developer(10000);
dev01.applyFor(new Secretary());