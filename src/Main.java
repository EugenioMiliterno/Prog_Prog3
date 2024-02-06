package src;

import java.util.Scanner;

public class Main implements Access {
    private Access access;
    Scanner sc = new Scanner(System.in);
    String pw;
    Main(){
        grantAccess(pw);
        if(access.state == null){
            System.out.println("Access denied.");
        }else if(access.state instanceof AdminAccess){
            System.out.println("Admin access granted.");
        }else if(access.state instanceof WaiterAccess){
            System.out.println("Waiter access granted.");
        }
        Menu menu = new Menu();
        Menu.getInstance().printMenu();
    }
    @Override
    public void grantAccess(String pw) {
        System.out.println("Inserisci PW per l'accesso\n");
        pw = sc.nextLine();
        access.grantAccess(pw);
    }
}
