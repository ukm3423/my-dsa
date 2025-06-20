package solid.dip;

interface NotificationService {
    void send(String message);
}

class EmailService implements NotificationService {
    public void send(String message) {
        System.out.println("📧 Email sent: " + message);
    }
}

class SMSService implements NotificationService {
    public void send(String message) {
        System.out.println("📱 SMS sent: " + message);
    }
}

class PushService implements NotificationService {
    public void send(String message) {
        System.out.println("🔔 Push Notification: " + message);
    }
}


class UserNotification {
    private NotificationService notificationService;

    // ✅ Injecting via constructor – Inversion of Control
    public UserNotification(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(String message) {
        notificationService.send(message);
    }
}

public class Main {
    public static void main(String[] args) {
        // You can change implementation here without touching UserNotification
        NotificationService email = new EmailService();
        NotificationService sms = new SMSService();
        NotificationService push = new PushService();

        UserNotification emailNotifier = new UserNotification(email);
        emailNotifier.notifyUser("Your order has been shipped via Email!");

        UserNotification smsNotifier = new UserNotification(sms);
        smsNotifier.notifyUser("Your order has been shipped via SMS!");

        UserNotification pushNotifier = new UserNotification(push);
        pushNotifier.notifyUser("Your order has been shipped via Push Notification!");
    }
}
