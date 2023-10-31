package Progetto.src;
import java.util.Date;
import java.util.Random;

public class Employee {
private 
    Random random = new Random();
    String nome,cognome,cf;
    int eta,ID;
    double stipendio;
    
public
    Employee(String n ,String cn ,String cf,int e ,double sal){
        this.nome=n;
        this.cognome=cn;
        this.cf=cf;
        this.ID = random.nextInt(100);
        this.eta=e;
        this.stipendio=sal;
    }
    public Employee() {
}
    int getID(){return this.ID;}
    String getNome(){return this.nome;}
    String getCognome(){return this.cognome;}
    String getCf(){return this.cf;}
    int getEta(){return this.eta;}
    double getStipendio(){return this.stipendio;}
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
