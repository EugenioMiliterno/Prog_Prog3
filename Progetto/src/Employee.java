package Progetto.src;
import java.util.Random;
import java.time.LocalDate;

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
    public Employee() {}
    int getID(){return this.ID;}
    String getNome(){return this.nome;}
    String getCognome(){return this.cognome;}
    String getCf(){return this.cf;}
    int getEta(){return this.eta;}
    double getStipendio(){return this.stipendio;}
    public boolean validateBooking(Reservation reservation,String TableName) {
        boolean e;
        LocalDate d = reservation.getDate();
        LocalDate today = LocalDate.now();
        String resName = reservation.getClientName();
        if(d.isAfter(today) && resName.equals(TableName)){
            e = true;
        }else{
            e = false;
        }
        return e;
    }
    public void StampaDati(Employee e){
        System.out.println("Employee Details:");
        System.out.println("Name: " + e.getNome());
        System.out.println("Surname: " + e.getCognome());
        System.out.println("CF: " + e.getCf());
        System.out.println("ID: " + e.getID());
        System.out.println("Age: " + e.getEta());
        System.out.println("Salary: " + e.getStipendio());
    }
}
