package src;
import java.time.LocalDate;
public class Reservation {
    private String nome, telefono, num_carta;
    private LocalDate data;
    private int num_persone;
    private boolean valid = false;
    private PaymentStrategy paymentStrategy;
    Reservation(String nome, String telefono, String num_carta, LocalDate data, int num_persone){
        this.nome = nome;
        this.telefono = telefono;
        this.num_carta = num_carta;
        this.data = data;
        this.num_persone = num_persone;
    }
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void pay(double amount) {
        this.paymentStrategy.pay(amount);
    }
}
