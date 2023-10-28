package Progetto.src;
import java.util.Date;

//Classe per gestire gli Impiegati (ovvero i camerieri)
public class Employee {
private
    //Attributi (gID = global ID)
    String nome,cognome,cf;
    int eta,ID,gID = 1;
    double stipendio;
public
    Employee(String n ,String cn ,String cf,int e ,double sal){
        this.nome=n;
        this.cognome=cn;
        this.cf=cf;
        this.ID = gID++;
        this.eta=e;
        this.stipendio=sal;
    }
    //Costruttore senza parametri
    public Employee() {}
    //Metodi Getter
    int getID(){return this.ID;}
    String getNome(){return this.nome;}
    String getCognome(){return this.cognome;}
    String getCf(){return this.cf;}
    int getEta(){return this.eta;}
    double getStipendio(){return this.stipendio;}
    //Function per controllare se una prenotazione è valida
    public boolean validateBooking(Reservation reservation,String TableName) {
        boolean e;
        Date d = reservation.getDate();
        Date today = new Date(2023,10,27);
        String resName = reservation.getClientName();
        if(d.after(today) && resName.equals(TableName)){
            e = true;
        }else{
            e = false;
        }
        return e;
    }
}
