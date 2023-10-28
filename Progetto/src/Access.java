package Progetto.src;

//Classe Generica per gestire le due tipologie di accesso
public class Access {
    //Stato dell'accesso (Waiter/Admin)
    private AccessState state;
    //Metodo che garantisce l'accesso tramite pw
    public Access(String pw) {
        if(pw == "Studente")
            this.state = new WaiterAccess();
        else if(pw == "Ciaramella")
            this.state = new AdminAccess();
    }
    //Function per il setting dello stato d'accesso
    public void setState(AccessState state) {
        this.state = state;
    }
    //Function per l'accesso effettivo
    public void grantAccess() {
        state.grantAccess();
    }
}
