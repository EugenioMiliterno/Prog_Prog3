package Progetto;
import java.util.ArrayList;

public class Menu {
    private ArrayList<String> appetizers;
    private ArrayList<String> entrees;
    private ArrayList<String> desserts;
    
    public Menu() {
        this.appetizers = new ArrayList<String>();
        this.entrees = new ArrayList<String>();
        this.desserts = new ArrayList<String>();
    }
    
    public void addAppetizer(String item) {
        this.appetizers.add(item);
    }
    
    public void addEntree(String item) {
        this.entrees.add(item);
    }
    
    public void addDessert(String item) {
        this.desserts.add(item);
    }
    
    public void printMenu() {
        System.out.println("Appetizers:");
        for (String item : this.appetizers) {
            System.out.println("- " + item);
        }
        
        System.out.println("Entrees:");
        for (String item : this.entrees) {
            System.out.println("- " + item);
        }
        
        System.out.println("Desserts:");
        for (String item : this.desserts) {
            System.out.println("- " + item);
        }
    }
}
