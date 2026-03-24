class EmailNotification {
    send() {
        console.log("Send Email");
    }
}

class SMSNotification {
    send() {
        console.log("Send SMS");
    }
}

// dùng
const type = "email";

let notification;

if (type === "email") {
    notification = new EmailNotification();
} else {
    notification = new SMSNotification();
}

notification.send();