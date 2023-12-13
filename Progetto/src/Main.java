package Progetto.src;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    String pw;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci la password: ");
        String pw = sc.nextLine();
        Access A = new Access(pw);
        System.out.println("PW:" + pw);
        AccessState AS;
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Mario", "Rossi","MR001", 24,800.23));
        employees.add(new Employee("Luigi", "Verdi","LV001", 42,1000.34));
        employees.add(new Employee("Giovanni", "Bianchi","GB001", 33,800.24));
        employees.add(new Employee("Giuseppe", "Neri","GN001", 41,900.21));
        employees.add(new Employee("Paolo", "Gialli", "PG001", 35, 600.10));
        ArrayList<Order> orders = new ArrayList<Order>();
        Menu M = new Menu();
        if(pw == "Ciaramella"){
            AS = new AdminAccess();
            A.setState(AS);
        }else if(pw == "Studente"){
            AS = new WaiterAccess();            
            A.setState(AS);
        }
        System.out.println("Access: " + A.getState());
        Random R = new Random();
        Order o = new Order();
        LocalDate DATA = LocalDate.of(2023, 10, 30);
        Reservation R1 = new Reservation(DATA,3,"Carlo","3336808802");
        sc.close();
    }
}
