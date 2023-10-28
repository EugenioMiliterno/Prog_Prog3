package Progetto.src;
import java.util.Date;

//Classe per la prenotazione di un tavolo
public class Reservation {
    private Date date;
    private int partySize;
    private String clientName;
    private String clientPhoneNumber;

    //Costruttore
    public Reservation(Date d, int partySize, String clientName, String clientPhoneNumber) {
        this.date = d;
        this.partySize = partySize;
        this.clientName = clientName;
        this.clientPhoneNumber = clientPhoneNumber;
        Employee employee = extracted();
        //Richiamo la function validateBooking
        //per controllare che la prenotazione sia valida
        boolean esito = employee.validateBooking(this, clientName);
        if(esito){
            System.out.println("Prenotazione valida");
        }else{
            System.out.println("Prenotazione non valida");
        }
    }

    //Ritorna un oggetto Impiegato, per invocare il metodo validateBooking()
    private Employee extracted() {
        return new Employee();
    }
    //Metodi Getter
    public Date getDate() {
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
    //Metodi Setter
    public void setPartySize(int partySize) {
        this.partySize = partySize;
    }
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    public void setClientPhoneNumber(String clientPhoneNumber) {
        this.clientPhoneNumber = clientPhoneNumber;
    }

    //Metodo per convertire la prenotazione in String
    //per effettuare una stampa
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
