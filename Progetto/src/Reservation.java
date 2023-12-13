package Progetto.src;
import java.util.Date;
import java.time.LocalDate;

public class Reservation {
    private LocalDate date;
    private int partySize;
    private String clientName;
    private String clientPhoneNumber;

    public Reservation(LocalDate d, int partySize, String clientName, String clientPhoneNumber) {
        this.date = d;
        this.partySize = partySize;
        this.clientName = clientName;
        this.clientPhoneNumber = clientPhoneNumber;
        Employee employee = extracted();
        boolean esito = employee.validateBooking(this, clientName);
        if(esito){
            System.out.println("Prenotazione valida");
        }else{
            System.out.println("Prenotazione non valida");
        }
    }

    private Employee extracted() {
        return new Employee();
    }

    public LocalDate getDate() {
        return date;
    }

    public Reservation getReservation() {
        return this;
    }

    public int getPartySize() {
        return partySize;
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientPhoneNumber() {
        return clientPhoneNumber;
    }

    public void setPartySize(int partySize) {
        this.partySize = partySize;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setClientPhoneNumber(String clientPhoneNumber) {
        this.clientPhoneNumber = clientPhoneNumber;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "date=" + date +
                ", partySize=" + partySize +
                ", clientName='" + clientName + '\'' +
                ", clientPhoneNumber='" + clientPhoneNumber + '\'' +
                '}';
    }
}