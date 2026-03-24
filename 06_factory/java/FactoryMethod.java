
public class FactoryMethod {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification("email");
        notification.send();
    }
}

interface Notification {
    void send();
}

class EmailNotification implements Notification {
    public void send() {
        System.out.println("Send Email");
    }
}

class SMSNotification implements Notification {
    public void send() {
        System.out.println("Send SMS");
    }
}

class NotificationFactory {

    public static Notification createNotification(String type) {
        if (type.equalsIgnoreCase("email")) {
            return new EmailNotification();
        }
        if (type.equalsIgnoreCase("sms")) {
            return new SMSNotification();
        }
        throw new IllegalArgumentException("Unknown type");
    }
}
