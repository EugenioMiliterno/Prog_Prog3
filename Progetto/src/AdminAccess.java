package Progetto.src;
//Classe per l'accesso Admin
public class AdminAccess implements AccessState {
    @Override
    public void grantAccess() {
        System.out.println("Admin access granted.");
    }
}
