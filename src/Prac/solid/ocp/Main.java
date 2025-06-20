package solid.ocp;

interface PaymentMethod {
    void pay(double amount);
}

class CreditCardPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("💳 Paid " + amount + " using Credit Card");
    }
}

class DebitCardPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("🏧 Paid " + amount + " using Debit Card");
    }
}

class UpiPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("📱 Paid " + amount + " using UPI");
    }
}

class PaymentProcessor {
    private PaymentMethod paymentMethod;

    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void process(double amount) {
        paymentMethod.pay(amount);
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentMethod credit = new CreditCardPayment();
        PaymentMethod debit = new DebitCardPayment();
        PaymentMethod upi = new UpiPayment();

        PaymentProcessor processor1 = new PaymentProcessor(credit);
        processor1.process(1000);

        PaymentProcessor processor2 = new PaymentProcessor(debit);
        processor2.process(500);

        PaymentProcessor processor3 = new PaymentProcessor(upi);
        processor3.process(750);
    }
}
