package src;

public class AdminAccess implements AccessState{
    public void grantAccess(String pw){
        if(pw.equals("Ciaramella")){
            System.out.println("Admin access granted.");
            AccessState state = new AdminAccess();
        }
    }
}
