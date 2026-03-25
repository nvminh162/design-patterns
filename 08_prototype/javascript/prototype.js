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

// create new fifa online player prototype
const prototypePattern = new FifaOnlinePlayer('CR7', "AL Nassor", "GAY", 0);

// create multi instance of the fifa online player
const cr7 = prototypePattern.clone();

const m10 = prototypePattern.clone();
m10.name = 'Messi';
m10.team = "PSG";

// test the instance
cr7.score();
cr7.score();
cr7.score();
console.log(cr7);
console.log(`${cr7.name} has record ${cr7.goals} this session`);

// test the instance
m10.score();
console.log(m10);
console.log(`${m10.name} has record ${m10.goals} this session`);
