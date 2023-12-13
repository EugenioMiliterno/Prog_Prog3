package Progetto.src;
import java.util.ArrayList;
import java.util.Random;
import java.time.LocalDate;

public class EmployeeAccess {
private
    String nome,cognome,cf;
    Random random = new Random();
    double stipendio;
    int eta,ID;
    ArrayList<Employee> employees = new ArrayList<Employee>();
public
    EmployeeAccess(String n ,String cn ,String cf,int e ,double sal,int ID){
        this.nome=n;
        this.cognome=cn;
        this.cf=cf;
        this.ID = ID;
        this.eta=e;
        this.stipendio=sal;
        employees.add(new Employee(n,cn,cf,e,sal));
    }
    //EmployeeAccess() {}
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
    public void saveEmployees(ArrayList<Employee> employees){this.employees = employees;}
    public ArrayList<Employee> getEmployees(){return employees;}
}
