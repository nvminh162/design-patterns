// SẾP: người quyết định mọi việc nhận request cuối
class Leader {
  approveOffer(offer) {
    if (offer > 10000) {
        console.log(`Reject: $${offer}`);
    } else {
        console.log(`Accept: $${offer}`);
    }
  }
}

// THƯ KÝ: người được uỷ quyền bởi SẾP
class Secretary {
  constructor() {
    this.leader = new Leader();
  }

  forwardRequest(offer) {
    // Khi THƯ KÝ nhận mọi request thì SẾP là người nhận được câu hỏi và giải quyết
    this.leader.approveOffer(offer);
  }
}

// DEVELOPER: người tạo ra yêu cầu offer gửi đến SẾP nhưng thông qua THƯ KÝ của SẾP
class Developer {
  constructor(offer) {
    this.offer = offer;
  }

  // DEVELOPER: gửi đến THƯ KÝ
  submitOffer(offer) {
    offer.forwardRequest(this.offer);
  }
}

const dev01 = new Developer(10001);
const dev02 = new Developer(5000);
dev01.submitOffer(new Secretary());
dev02.submitOffer(new Secretary());