package Progetto.src;
import java.math.BigDecimal;
import java.time.LocalDate;

//Interfaccia per gestire i pagamenti
interface PaymentStrategy {
    void pay(BigDecimal amount);
}
//Classe per gestire il pagamento TRAMITE CARTA
class CreditCardPaymentStrategy implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private String expirationDate;
    
    //Costruttore
    public CreditCardPaymentStrategy(String name, String cardNumber, String cvv, String expirationDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
    }
    //Metodi Getter
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
    //Metodo per controllare se una data viene dopo l'altr
    private boolean compareDate(LocalDate A, LocalDate B){
        if(A.compareTo(B) > 0){
            return true;
        }else{
            return false;
        }
    }
    //Metodo per il controllo del pagamento
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
    //;etodo per implementare il pagamento TRAMITE CARTA
    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Paying " + amount + " with credit card " + cardNumber);
    }
}

//Classe per gestire il pagamento TRATMITE CONTANTI
class CashPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Paying " + amount + " in cash");
    }
}
//Classe pagamento, per gestire entrambi i metodi
class Payment {
    //Attributo che specifica quale metodo si è scelto
    private PaymentStrategy paymentStrategy;

    //Costruttore
    public Payment(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    //Metodo per il pagamento effettivo
    public void pay(BigDecimal amount) {
        paymentStrategy.pay(amount);
    }
}
