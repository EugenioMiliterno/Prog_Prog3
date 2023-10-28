package Progetto.src;
//Classe per l'accesso utente
public class WaiterAccess implements AccessState {
    @Override
    public void grantAccess() {
        System.out.println("User access granted.");
    }
}