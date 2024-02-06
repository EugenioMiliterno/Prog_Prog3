package src;

public class CashPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Pagamento di " + amount + " euro effettuato in contanti.");
    }
}
