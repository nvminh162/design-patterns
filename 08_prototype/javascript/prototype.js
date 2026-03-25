// define a prototype object for FIFA Online
class FifaOnlinePlayer {
    constructor(name, team, position, goals) {
        this.name = name;
        this.team = team;
        this.position = position;
        this.goals = goals;
    }

    score() {
        this.goals++;
    }

    clone() {
        return new FifaOnlinePlayer(this.name, this.team, this.position, this.goals);
    }
}

// ========================
// NHƯỢC ĐIỂM Ở ĐÂY
FifaOnlinePlayer.prototype.stats = {
    minutesPlayed: 0
}

// create new fifa online player prototype
const prototypePattern = new FifaOnlinePlayer('CR7', "AL Nassor", "GAY", 0);

// create multi instance of the fifa online player
const cr7 = prototypePattern.clone();
cr7.stats.minutesPlayed = 10000; // thêm cho CR7 nhưng messi vẫn nhận 10000

const m10 = prototypePattern.clone();
m10.name = 'Messi';
m10.team = "PSG";

// test the instance
cr7.score();
cr7.score();
cr7.score();
console.log(cr7);
console.log(`${cr7.name} has record ${cr7.goals} this session ${JSON.stringify(cr7.stats)}`);

// test the instance
m10.score();
console.log(m10);
console.log(`${m10.name} has record ${m10.goals} this session ${JSON.stringify(m10.stats)}`);

// nhược điểm fix => Shallow Copy (deep copy) để fix nhược điểm => tạo tham chiếu mới cho thuộc tính khi tạo ra