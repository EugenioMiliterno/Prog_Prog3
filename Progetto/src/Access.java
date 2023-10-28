package Progetto.src;

public class Access {
    private AccessState state;

    public Access(String pw) {
        if(pw == "Studente")
            this.state = new WaiterAccess();
        else if(pw == "Ciaramella")
            this.state = new AdminAccess();
    }

    public void setState(AccessState state) {
        this.state = state;
    }

    public void grantAccess() {
        state.grantAccess();
    }
}
