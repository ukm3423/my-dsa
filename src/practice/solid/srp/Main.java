package practice.solid.srp;

class Invoice {
    private String customer;
    private double amount;

    public Invoice(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }

    public String getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }
}
class InvoicePrinter {
    public void print(Invoice invoice, double totalAmount) {
        System.out.println("🧾 Invoice for: " + invoice.getCustomer());
        System.out.println("💰 Amount: " + invoice.getAmount());
        System.out.println("📄 Total with Tax: " + totalAmount);
    }
}

class InvoiceCalculator {
    public double calculateTax(Invoice invoice) {
        return invoice.getAmount() * 0.18;
    }

    public double calculateTotal(Invoice invoice) {
        return invoice.getAmount() + calculateTax(invoice);
    }
}

class InvoicePersistence {
    public void save(Invoice invoice) {
        System.out.println("💾 Saving invoice for " + invoice.getCustomer() + "...");
    }
}

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("John Doe", 1000);

        InvoiceCalculator calculator = new InvoiceCalculator();
        double total = calculator.calculateTotal(invoice);

        InvoicePrinter printer = new InvoicePrinter();
        printer.print(invoice, total);

        InvoicePersistence persistence = new InvoicePersistence();
        persistence.save(invoice);
    }
}

