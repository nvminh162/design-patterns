
public class Proxy {
    public static void main(String[] args) {
        Developer dev01 = new Developer(10001);
        Developer dev02 = new Developer(5000);

        dev01.submitOffer(new Secretary());
        dev02.submitOffer(new Secretary());
    }
}

class Leader {
    public void approveOffer(double offer) {
        if (offer > 10000) {
            System.out.println("Reject: $" + offer);
        } else {
            System.out.println("Accept: $" + offer);
        }
    }
}

class Secretary {
    private Leader leader;

    public Secretary() {
        this.leader = new Leader();
    }

    public void forwardRequest(double offer) {
        leader.approveOffer(offer);
    }
}

class Developer {
    private double offer;

    public Developer(double offer) {
        this.offer = offer;
    }

    public void submitOffer(Secretary secretary) {
        secretary.forwardRequest(offer);
    }
}
