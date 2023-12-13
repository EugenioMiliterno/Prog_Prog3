package Progetto.src;
import java.util.ArrayList;
import java.util.List;

public class EmployeeView {
    private EmployeeViewModel viewModel;
    ArrayList<Employee> employees = new ArrayList<Employee>();

    public void displayEmployeeDetails() {
        String name = viewModel.getName();
        int age = viewModel.getAge();
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void updateView() {
        displayEmployeeDetails();
    }

    public void update(EmployeeModel E){
        employees = E.getEmployees();
        for(Employee e : employees){
            System.out.println("Employee Details:");
            System.out.println("Name: " + e.getNome());
            System.out.println("Surname: " + e.getCognome());
            System.out.println("CF: " + e.getCf());
            System.out.println("ID: " + e.getID());
            System.out.println("Age: " + e.getEta());
            System.out.println("Salary: " + e.getStipendio());
        }
    }

    public void update(){
        employees = viewModel.getEmployees();
        for(Employee e : employees){
            System.out.println("Employee Details:");
            System.out.println("Name: " + e.getNome());
            System.out.println("Surname: " + e.getCognome());
            System.out.println("CF: " + e.getCf());
            System.out.println("ID: " + e.getID());
            System.out.println("Age: " + e.getEta());
            System.out.println("Salary: " + e.getStipendio());
        }
    }
}
