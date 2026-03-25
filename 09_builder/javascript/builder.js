// ==================== PRODUCT ====================
class FifaOnlinePlayer {
    constructor(builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.nationality = builder.nationality;
        this.position = builder.position;
        this.team = builder.team;
        this.stats = builder.stats;
    }

    toString() {
        let player = 'Player:\n';
        player += `- Name: ${this.name}\n`;
        player += `- Age: ${this.age}\n`;
        player += `- Nationality: ${this.nationality}\n`;
        player += `- Position: ${this.position}\n`;
        player += `- Team: ${this.team}\n`;
        player += `- Stats: ${JSON.stringify(this.stats)}\n`;
        return player;
    }
}


// ==================== BUILDER ====================
class FifaOnlinePlayerBuilder {
    constructor() {
        // default value
        this.name = '';
        this.age = 0;
        this.nationality = '';
        this.position = '';
        this.team = '';
        this.stats = {};
    }

    withName(name) {
        this.name = name;
        return this; // chain
    }

    withAge(age) {
        this.age = age;
        return this;
    }

    withNationality(nationality) {
        this.nationality = nationality;
        return this;
    }

    withPosition(position) {
        this.position = position;
        return this;
    }

    withTeam(team) {
        this.team = team;
        return this;
    }

    withStats(stats) {
        this.stats = stats;
        return this;
    }

    build() {
        return new FifaOnlinePlayer(this);
    }
}

const player = new FifaOnlinePlayerBuilder()
    .withName("CR7")
    .withAge(38)
    .withNationality("Portugal")
    .withPosition("ST")
    .withTeam("Al Nassr")
    .withStats({ goals: 10, assists: 5 })
    .build();

console.log(player.toString());