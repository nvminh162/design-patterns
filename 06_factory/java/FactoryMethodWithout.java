
public class FactoryMethodWithout {
    public static void main(String[] args) {

        String type = "email";
        Notification notification;

        if (type.equals("email")) {
            notification = new EmailNotification(); // ❌ new trực tiếp
        } else {
            notification = new SMSNotification(); // ❌ new trực tiếp
        } 

        /*
        else if (type.equals("zalo")) ... => 👉 code sẽ ngày càng bẩn
         */

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