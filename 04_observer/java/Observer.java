import java.util.ArrayList;
import java.util.List;

public class Observer {
    public static void main(String[] args) {
        Subject subject = new Subject();

        ObserverObject yasuo = new ObserverObject("Yasuo");
        ObserverObject leesin = new ObserverObject("Lessin");
        ObserverObject yumi = new ObserverObject("Yumi");

        subject.addObserver(yasuo);
        subject.addObserver(leesin);
        subject.addObserver(yumi);

        subject.notify(new Location(123, 123));
    }
}

class Location {
    private long longitude;
    private long latitude;

    public Location(long longitude, long latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "Location [longitude=" + longitude + ", latitude=" + latitude + "]";
    }
}

class ObserverObject {

    private String namePick;

    public ObserverObject(String namePick) {
        this.namePick = namePick;
    }

    public void gotaHelp(Location location) {
        System.out.println(namePick + " PING " + location);
    }

    public void updateStatus(Location location) {
        gotaHelp(location);
    }
}

class Subject {

    private List<ObserverObject> observerList;

    public Subject() {
        this.observerList = new ArrayList<>();
    }

    public void addObserver(ObserverObject observer) {
        this.observerList.add(observer);
    }

    public void notify(Location location) {
        this.observerList.forEach(observer -> observer.updateStatus(location));
    }
}
