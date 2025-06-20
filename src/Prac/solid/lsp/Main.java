
interface Payment {
    void pay(double amount);
}

interface Refundable {
    void refund(double amount);
}

class StripePayment implements Payment, Refundable {
    public void pay(double amount) {
        System.out.println("Paid via Stripe: " + amount);
    }

    public void refund(double amount) {
        System.out.println("Refunded via Stripe: " + amount);
    }
}

class CashOnDeliveryPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Cash on delivery for: " + amount);
    }
}

public class Main {
    public static void processPayment(Payment payment, double amount) {
        payment.pay(amount);
    }

    public static void processRefund(Refundable refundable, double amount) {
        refundable.refund(amount);
    }

    public static void main(String[] args) {
        Payment stripe = new StripePayment();
        Payment cod = new CashOnDeliveryPayment();

        processPayment(stripe, 1000);
        processPayment(cod, 1500);

        processRefund((Refundable) stripe, 300); // ✅ Safe
        // processRefund((Refundable) cod, 200); // ❌ Compile-time error — Safe by design
    }
}
