package Progetto.src;
import java.util.Observable;
import java.util.Observer;

//Classe Dish per gestire un piatto del menù, usando il pattern Observable
public class Dish extends Observable {
    private String name;
    private double price;
    //Costruttore del piatto
    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }
    //Metodi getter
    public String getName() {
        return name;
    }
    public double getCost() {
        return price;
    }
    //Metodi Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
