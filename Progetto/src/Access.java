package Progetto.src;
import java.util.Scanner;

public class Access {
    private AccessState state;

    public Access(String pw) {
        if(pw == "Studente"){
            this.state = new WaiterAccess();
            System.out.println("Waiter access granted.");
        }else if(pw == "Ciaramella"){
            this.state = new AdminAccess();
            System.out.println("Admin access granted.");
        }else{
            while(pw != "Studente" && pw != "Ciaramella"){
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
