package Progetto.src;
import java.util.Scanner;

public class Access {
    private AccessState state;
    String pwInserted;
    public Access(String pw) {
        if(pw.equals("Studente")){
            this.state = new WaiterAccess();
            System.out.println("Waiter access granted.");
        }else if(pw.equals("Ciaramella")){
            this.state = new AdminAccess();
            System.out.println("Admin access granted.");
        }else{
            while(!pw.equals("Studente") && !pw.equals("Ciaramella")){
                if(pw.equals("Esci")){
                    System.exit(0);
                }
                System.out.println("Password Incorretta, riprova.");
                Scanner sc = new Scanner(System.in);
                pw = sc.nextLine();
            }
        }
    }

    public void setState(AccessState state) {
        this.state = state;
    }

    public AccessState getState() {
        return this.state;
    }

    public void grantAccess() {
        state.grantAccess();
    }
}
