package Progetto.src;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    String pw;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci la password: ");
        String pw = sc.nextLine();
        Access A = new Access(pw);
        ArrayList<Employee> employees = new ArrayList<Employee>();
        ArrayList<Order> orders = new ArrayList<Order>();
        for(int i=0;i<5;i++){
            Employee e = new Employee();
            employees.add(e);
        }
        for(int j=0;j<20;j++){
            Order o = new Order();
            orders.add(o);
        }
        Menu M = new Menu();
        M.printMenu();
        
    }
}
