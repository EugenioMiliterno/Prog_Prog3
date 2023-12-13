package Progetto.src;
import java.util.ArrayList;


public class EmployeeViewModel {
    private EmployeeModel model;
    private EmployeeView view;
    private EmployeeAccess access;

    public EmployeeViewModel(EmployeeModel model, EmployeeView view, EmployeeAccess access) {
        this.model = model;
        this.view = view;
        this.access = access;
    }

    public String getName(){return this.model.getName();}

    public void fetchData() {
        // Ottieni i dati degli employee tramite l'accesso
        ArrayList<Employee> employees = access.getEmployees();
        // Aggiorna il modello con i dati ottenuti
        model.setEmployees(employees);
        // Aggiorna la vista con il modello aggiornato
        view.update(model);
    }

    public void saveData() {
        // Ottieni i dati dal modello
        ArrayList<Employee> employees = model.getEmployees();
        // Salva i dati tramite l'accesso
        access.saveEmployees(employees);
    }

    ArrayList<Employee> getEmployees(){return model.getEmployees();}

    public int getAge() {
        return model.getAge();
    }
}