class Notification {
    send() {
        throw new Error("Must override");
    }
}

class EmailNotification extends Notification {
    send() {
        console.log("Send Email");
    }
}

class SMSNotification extends Notification {
    send() {
        console.log("Send SMS");
    }
}

class NotificationFactory {
    static createNotification(type) {
        if (type === "email") return new EmailNotification();
        if (type === "sms") return new SMSNotification();
    }
}

const notification = NotificationFactory.createNotification("sms");
notification.send();