package Progetto.src;
import java.math.BigDecimal;
import java.time.LocalDate;

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

    String getName() {
        return name;
    }
    String getCNumb(){
        return cardNumber;
    }
    String getCVV(){
        return cvv;
    }
    String getExpDate(){
        return expirationDate;
    }

    private boolean compareDate(LocalDate A, LocalDate B){
        if(A.compareTo(B) > 0){
            return true;
        }else{
            return false;
        }
    }

    private boolean ValidPayment(String num,String exp, String CVV){
        LocalDate today = LocalDate.now();
        LocalDate expDate = LocalDate.parse(exp);
        boolean esito = false;
        if(Integer.valueOf(num)>0 && compareDate(expDate, today) && (Integer.parseInt(CVV)>0 && Integer.parseInt(CVV) < 1000)){
            esito = true;
        }else{
            esito = false;
        }
        return esito;
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
