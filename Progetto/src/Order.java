package Progetto.src;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Order implements Observer {
    private List<Dish> dishes;
    private double totalCost;

    public Order() {
        dishes = new ArrayList<>();
        totalCost = 0.0;
    }

    public int getOrdSize(){
        return this.dishes.size();
    }

    public Dish getDish(int index) {
        return dishes.get(index);
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
        dish.addObserver(this);
        totalCost += dish.getCost();
    }

    public void removeDish(Dish dish) {
        dishes.remove(dish);
        dish.deleteObserver(this);
        totalCost -= dish.getCost();
    }

    public double getTotalCost() {
        return totalCost;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Double) {
            totalCost += (Double) arg;
        }
    }
}
