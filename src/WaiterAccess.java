package src;

public class WaiterAccess implements AccessState {
    public void grantAccess(String pw) {
        if(pw.equals("Cameriere")){
            System.out.println("Waiter access granted.");
            AccessState state = new WaiterAccess();
        }else
            System.out.println("Waiter access denied.");
    }
}
