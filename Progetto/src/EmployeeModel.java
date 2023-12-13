package Progetto.src;

import java.util.ArrayList;

public class EmployeeModel {
    private String name;
    private int age;
    ArrayList<Employee> employees = new ArrayList<Employee>();

    public EmployeeModel(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getEmployees(){return employees;}

    public void setAge(int age) {
        this.age = age;
    }
    public void setEmployees(ArrayList<Employee> employees){this.employees = employees;}
}
