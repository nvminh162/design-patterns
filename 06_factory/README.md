Ok, mình sẽ cho bạn thấy **2 phiên bản đặt cạnh nhau**:

👉 ❌ **Không dùng Pattern**
👉 ✅ **Dùng Factory Method Pattern**

=> bạn sẽ thấy khác biệt ngay

---

# ❌ 1. KHÔNG dùng Factory Pattern

```java
public interface Notification {
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
```

## ❌ Main (logic bị dính chặt)

```java
public class Main {
    public static void main(String[] args) {

        String type = "email";
        Notification notification;

        if (type.equals("email")) {
            notification = new EmailNotification(); // ❌ new trực tiếp
        } else {
            notification = new SMSNotification();   // ❌ new trực tiếp
        }

        notification.send();
    }
}
```

---

## 🚨 Vấn đề

* Main phải biết:

  * class nào cần tạo
* Nếu thêm Zalo:

  ```java
  else if (type.equals("zalo")) ...
  ```

  👉 code sẽ ngày càng bẩn

---

# ✅ 2. DÙNG Factory Method Pattern

## Factory

```java
public class NotificationFactory {

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
```

---

## ✅ Main (sạch hơn)

```java
public class Main {
    public static void main(String[] args) {

        Notification notification =
                NotificationFactory.createNotification("email");

        notification.send();
    }
}
```

---

# 💥 So sánh trực tiếp

| Không Pattern             | Có Pattern                     |
| ------------------------- | ------------------------------ |
| `new EmailNotification()` | `Factory.createNotification()` |
| if-else trong main        | gom vào factory                |
| khó mở rộng               | dễ thêm loại mới               |
| logic rải rác             | tập trung 1 chỗ                |

---

# 🧠 Hiểu đúng bản chất

👉 Không pattern:

> "Tôi tự tạo object"

👉 Có pattern:

> "Tôi nhờ factory tạo giúp"

---

# 🔥 Khi nào cần Factory?

Khi bạn thấy:

* code có nhiều `new Something()`
* nhiều `if-else` theo type
* dễ thêm loại mới trong tương lai

👉 Lúc đó dùng Factory là chuẩn

---

# ⚡ Chốt 1 câu cho bạn nhớ

> ❌ Không pattern = new trực tiếp
> ✅ Factory = gọi 1 method để tạo object

---

Nếu bạn muốn, mình có thể:

* chuyển ví dụ này sang **Spring Boot (rất thực tế)**
* hoặc quay lại code logistics của bạn và refactor đúng chuẩn
* hoặc giải thích luôn **Factory Method vs Abstract Factory (rất hay ra thi)** 🚀
