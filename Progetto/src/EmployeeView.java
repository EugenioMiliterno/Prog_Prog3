package Progetto.src;
import java.util.List;

public class EmployeeView {
    private EmployeeViewModel viewModel;

    public EmployeeView(EmployeeViewModel viewModel) {
        this.viewModel = viewModel;
    }

    public void displayEmployeeDetails() {
        String name = viewModel.getName();
        int age = viewModel.getAge();

        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
