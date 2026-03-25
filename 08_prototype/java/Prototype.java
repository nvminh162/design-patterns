import java.util.HashMap;
import java.util.Map;

/*
==================== PROTOTYPE PATTERN ====================

- Clone object thay vì tạo mới
- Có 2 vấn đề:
    1. Shallow copy → shared reference (BUG)
    2. Deep copy → FIX

File này demo cả 2
*/

public class Prototype {

    public static void main(String[] args) {

        System.out.println("============= SHALLOW COPY (BUG) =============");

        // prototype ban đầu
        PlayerShallow prototype = new PlayerShallow("CR7", "AL Nassor", "ST", 0);

        PlayerShallow cr7 = prototype.clone();
        PlayerShallow m10 = prototype.clone();

        // đổi stats của CR7
        cr7.stats.put("minutesPlayed", 10000);

        m10.name = "Messi";
        m10.team = "PSG";

        cr7.score();
        cr7.score();

        m10.score();

        // ❗ BUG: stats bị dùng chung
        System.out.println(cr7.name + " stats: " + cr7.stats);
        System.out.println(m10.name + " stats: " + m10.stats);


        System.out.println("\n============= DEEP COPY (FIX) =============");

        PlayerDeep prototype2 = new PlayerDeep("CR7", "AL Nassor", "ST", 0);

        PlayerDeep cr7_2 = prototype2.clone();
        PlayerDeep m10_2 = prototype2.clone();

        // chỉ CR7 thay đổi
        cr7_2.stats.put("minutesPlayed", 10000);

        m10_2.name = "Messi";
        m10_2.team = "PSG";

        cr7_2.score();
        cr7_2.score();

        m10_2.score();

        // ✅ FIX: mỗi object có stats riêng
        System.out.println(cr7_2.name + " stats: " + cr7_2.stats);
        System.out.println(m10_2.name + " stats: " + m10_2.stats);
    }
}

/*
==================== VERSION 1: SHALLOW COPY ====================
- stats bị share giữa các object
*/
class PlayerShallow implements Cloneable {

    public String name;
    public String team;
    public String position;
    public int goals;

    // ❗ shared reference (BUG)
    public Map<String, Integer> stats;

    public PlayerShallow(String name, String team, String position, int goals) {
        this.name = name;
        this.team = team;
        this.position = position;
        this.goals = goals;

        this.stats = new HashMap<>();
        this.stats.put("minutesPlayed", 0);
    }

    public void score() {
        goals++;
    }

    public PlayerShallow clone() {
        try {
            // ❗ shallow copy → stats bị dùng chung
            return (PlayerShallow) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

/*
==================== VERSION 2: DEEP COPY ====================
- clone cả stats → không còn share
*/
class PlayerDeep implements Cloneable {

    public String name;
    public String team;
    public String position;
    public int goals;

    public Map<String, Integer> stats;

    public PlayerDeep(String name, String team, String position, int goals) {
        this.name = name;
        this.team = team;
        this.position = position;
        this.goals = goals;

        this.stats = new HashMap<>();
        this.stats.put("minutesPlayed", 0);
    }

    public void score() {
        goals++;
    }

    public PlayerDeep clone() {
        try {
            PlayerDeep cloned = (PlayerDeep) super.clone();

            // ✅ deep copy → tạo object mới cho stats
            cloned.stats = new HashMap<>(this.stats);

            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}