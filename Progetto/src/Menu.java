package Progetto.src;
import java.util.ArrayList;

public class Menu {
    private static ArrayList<String> appetizers;
    private static ArrayList<String> entrees;
    private static ArrayList<String> desserts;
    
    public void initAppetizers(){
        appetizers.add("Bruschetta");
        appetizers.add("Caprese");
        appetizers.add("Insalata");
        appetizers.add("Frittura");
    }

    public void initEntrees(){
        entrees.add("Spaghetti");
        entrees.add("Lasagne");
        entrees.add("Risotto");
        entrees.add("Pizza");
    }

    public void initDesserts(){
        desserts.add("Tiramisù");
        desserts.add("Panna cotta");
        desserts.add("Gelato");
        desserts.add("Torta della nonna");
    }

    public Menu() {
        this.appetizers = new ArrayList<String>();
        this.entrees = new ArrayList<String>();
        this.desserts = new ArrayList<String>();
        initAppetizers();
        initEntrees();
        initDesserts();
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
    static ArrayList<String> getEntrees(){return entrees;}
    static ArrayList<String> getAppetizers(){return appetizers;}
    static ArrayList<String> getDesserts(){return desserts;}
}
