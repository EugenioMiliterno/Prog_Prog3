package Progetto.src;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Locale;
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
        AccessState AS;
        ArrayList<Employee> employees = new ArrayList<Employee>();
        int num_dip;
        System.out.println("Inserisci il numero di dipendenti: ");
        num_dip = sc.nextInt();
        for(int i=0;i<num_dip;i++){
            String n,c,cf;
            int e;
            double sal;
            System.out.println("Inserisci il nome: ");
            n = sc.nextLine();
            System.out.println("Inserisci il cognome: ");
            c = sc.nextLine();
            System.out.println("Inserisci il codice fiscale: ");
            cf = sc.nextLine();
            System.out.println("Inserisci l'età: ");
            e = sc.nextInt();
            System.out.println("Inserisci lo stipendio: ");
            sal = sc.nextDouble();
            employees.add(new Employee(n,c,cf,e,sal));
            EmployeeAccess EA = new EmployeeAccess(n,c,cf,e,sal,i+1);
            EA.saveEmployees(employees);
        }
        for(Employee e : employees){
            e.StampaDati();
        }
        ArrayList<Order> orders = new ArrayList<Order>();
        Menu M = new Menu();
        Random R = new Random();
        Order o = new Order();
        LocalDate DATA = LocalDate.of(2024, 10, 30);
        Reservation R1 = new Reservation(DATA,3,"Carlo","3336808802");
        sc.close();
    }
}
