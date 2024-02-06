package src;

import javax.swing.plaf.nimbus.State;

public interface Access {
    public AccessState state=null;
    void grantAccess(String pw);
}
