package Progetto;
import java.math.BigDecimal;

interface PaymentStrategy {
    void pay(BigDecimal amount);
}

class CreditCardPaymentStrategy implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private String expirationDate;

    public CreditCardPaymentStrategy(String name, String cardNumber, String cvv, String expirationDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
    }

    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Paying " + amount + " with credit card " + cardNumber);
    }
}

class CashPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Paying " + amount + " in cash");
    }
}

class Payment {
    private PaymentStrategy paymentStrategy;

    public Payment(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(BigDecimal amount) {
        paymentStrategy.pay(amount);
    }
}
