package src;
// Interfaccia per le strategie di pagamento
public interface PaymentStrategy {
    void pay(double amount);
}
// Implementazione della strategia di pagamento con carta
class CreditCardPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Pagamento di " + amount + " euro effettuato con carta di credito.");
    }
}
// Implementazione della strategia di pagamento in contanti
class CashPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Pagamento di " + amount + " euro effettuato in contanti.");
    }
}

// Classe principale PaymentStrategy
class PaymentMethod {
    private PaymentStrategy paymentStrategy;
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void makePayment(double amount) {
        paymentStrategy.pay(amount);
    }
}
