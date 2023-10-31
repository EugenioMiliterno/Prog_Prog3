package Progetto.src;

public class Access {
    private AccessState state;

    public Access(String pw) {
        if(pw == "Studente"){
            this.state = new WaiterAccess();
            System.out.println("Waiter access granted.");
        }else if(pw == "Ciaramella"){
            this.state = new AdminAccess();
            System.out.println("Admin access granted.");
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
