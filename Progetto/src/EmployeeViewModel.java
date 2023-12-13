package Progetto.src;
import java.util.List;

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
        List<Employee> employees = access.getEmployees();

        // Aggiorna il modello con i dati ottenuti
        model.setEmployees(employees);

        // Aggiorna la vista con il modello aggiornato
        view.update(model);
    }

    public void saveData() {
        // Ottieni i dati dal modello
        List<Employee> employees = model.getEmployees();

        // Salva i dati tramite l'accesso
        access.saveEmployees(employees);
    }
}
public class EmployeeAccess {
    // Implementa qui la logica per l'accesso ai dati degli employee
    public List<Employee> getEmployees() {
        // Implementa qui la logica per ottenere i dati degli employee
    }

    public void saveEmployees(List<Employee> employees) {
        // Implementa qui la logica per salvare i dati degli employee
    }
}
