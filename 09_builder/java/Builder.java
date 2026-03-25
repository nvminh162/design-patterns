import java.util.HashMap;
import java.util.Map;

public class Builder {

    public static void main(String[] args) {
        Map<String, Integer> stats = new HashMap<>();
        stats.put("goals", 10);
        stats.put("assists", 5);

        FifaOnlinePlayer player = new FifaOnlinePlayerBuilder()
                .withName("CR7")
                .withAge(38)
                .withNationality("Portugal")
                .withPosition("ST")
                .withTeam("Al Nassr")
                .withStats(stats)
                .build();

        System.out.println(player);
    }
}

class FifaOnlinePlayer {
    private final String name;
    private final int age;
    private final String nationality;
    private final String position;
    private final String team;
    private final Map<String, Integer> stats;

    public FifaOnlinePlayer(FifaOnlinePlayerBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.nationality = builder.nationality;
        this.position = builder.position;
        this.team = builder.team;
        this.stats = builder.stats;
    }

    @Override
    public String toString() {
        return "Player:\n"
                + "- Name: " + name + "\n"
                + "- Age: " + age + "\n"
                + "- Nationality: " + nationality + "\n"
                + "- Position: " + position + "\n"
                + "- Team: " + team + "\n"
                + "- Stats: " + stats + "\n";
    }
}

class FifaOnlinePlayerBuilder {
    String name = "";
    int age = 0;
    String nationality = "";
    String position = "";
    String team = "";
    Map<String, Integer> stats = new HashMap<>();

    public FifaOnlinePlayerBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public FifaOnlinePlayerBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public FifaOnlinePlayerBuilder withNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    public FifaOnlinePlayerBuilder withPosition(String position) {
        this.position = position;
        return this;
    }

    public FifaOnlinePlayerBuilder withTeam(String team) {
        this.team = team;
        return this;
    }

    public FifaOnlinePlayerBuilder withStats(Map<String, Integer> stats) {
        this.stats = stats;
        return this;
    }

    public FifaOnlinePlayer build() {
        return new FifaOnlinePlayer(this);
    }
}
