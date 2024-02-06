package src;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CreditCardPayment implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private LocalDate expirationDate;
    public CreditCardPayment(String name, String cardNumber, String cvv, String expirationDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirationDate = LocalDate.parse(expirationDate);
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
    LocalDate getExpDate(){
        return expirationDate;
    }
    private boolean ValidPayment(String num,String exp, String CVV){
        LocalDate today = LocalDate.now();
        LocalDate expDate = LocalDate.parse(exp);
        boolean esito = false;
        if(Integer.valueOf(num)>0 && expirationDate.isAfter(today) && (Integer.parseInt(CVV)>0 && Integer.parseInt(CVV) < 1000)){
            esito = true;
        }else{
            esito = false;
        }
        return esito;
    }
    public void pay(double amount) {
        if(ValidPayment(cardNumber, expirationDate.toString(), cvv)){
            System.out.println("Pagamento di " + amount + " euro effettuato con carta di credito.");
        }else{
            System.out.println("Pagamento non valido.");
        }
    }
}
