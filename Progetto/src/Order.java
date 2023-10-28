package Progetto.src;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

//Classe per gesitre gli ordini dei clienti, usando il pattern Observer
public class Order implements Observer {
    private List<Dish> dishes;
    private double totalCost;
    //Costruttore
    public Order() {
        dishes = new ArrayList<>();
        totalCost = 0.0;
    }
    //Metodo per l'aggiunta di un piatto (antipasto/primo/dolce)
    public void addDish(Dish dish) {
        dishes.add(dish);
        dish.addObserver(this);
        totalCost += dish.getCost();
    }
    //Metodo per la rimozione di un piatto
    public void removeDish(Dish dish) {
        dishes.remove(dish);
        dish.deleteObserver(this);
        totalCost -= dish.getCost();
    }
    //Metodo per ritornare il costo di tutto l'ordine
    public double getTotalCost() {
        return totalCost;
    }

    //Metodo per l'update dell'Observer collegato all'oggetto
    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Double) {
            totalCost += (Double) arg;
        }
    }
}
