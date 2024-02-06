package src;

import java.util.ArrayList;

public class Menu {
    private ArrayList<ArrayList<Dish>> menu;
    private static Menu instance;
    Menu(){
        menu = new ArrayList<ArrayList<Dish>>();
    }
    public void initEntrees(){
        ArrayList<Dish> entrees = new ArrayList<Dish>();
        entrees.add(new Dish("Antipasto di mare", "Antipasto di mare", 8));
        entrees.add(new Dish("Antipasto di terra", "Antipasto di terra", 10));
        entrees.add(new Dish("Antipasto misto", "Antipasto misto", 10));
        menu.add(entrees);
    }
    public void initFirstCourses(){
        ArrayList<Dish> firstCourses = new ArrayList<Dish>();
        firstCourses.add(new Dish("Pasta al pomodoro", "Pasta al pomodoro", 10));
        firstCourses.add(new Dish("Pasta al ragù", "Pasta al ragù", 10));
        firstCourses.add(new Dish("Pasta al pesto", "Pasta al pesto", 10));
        menu.add(firstCourses);
    }
    public void initSecondCourses(){
        ArrayList<Dish> secondCourses = new ArrayList<Dish>();
        secondCourses.add(new Dish("Bistecca", "Bistecca", 10));
        secondCourses.add(new Dish("Pollo", "Pollo", 10));
        secondCourses.add(new Dish("Pesce", "Pesce", 10));
        menu.add(secondCourses);
    }
    public void initDesserts(){
        ArrayList<Dish> desserts = new ArrayList<Dish>();
        desserts.add(new Dish("Tiramisù", "Tiramisù", 10));
        desserts.add(new Dish("Panna cotta", "Panna cotta", 10));
        desserts.add(new Dish("Gelato", "Gelato", 10));
        menu.add(desserts);
    }
    public void initPizze(){
        ArrayList<Dish> pizze = new ArrayList<Dish>();
        pizze.add(new Dish("Margherita", "Margherita", 10));
        pizze.add(new Dish("Marinara", "Marinara", 10));
        pizze.add(new Dish("Quattro stagioni", "Quattro stagioni", 10));
        menu.add(pizze);
    }
    public ArrayList<Dish> getEntrees(){
        return menu.get(0);
    }
    public ArrayList<Dish> getFirstCourses(){
        return menu.get(1);
    }
    public ArrayList<Dish> getSecondCourses(){
        return menu.get(2);
    }
    public ArrayList<Dish> getDesserts(){
        return menu.get(3);
    }
    public ArrayList<Dish> getPizze(){
        return menu.get(4);
    }
    public void AddDish(String type,float cost){
        if (type.equals("Antipasto")) {
            menu.get(0).add(new Dish(type, "", cost));
        } else if (type.equals("Primo")) {
            menu.get(1).add(new Dish(type, "", cost));
        } else if (type.equals("Secondo")) {
            menu.get(2).add(new Dish(type, "", cost));
        } else if (type.equals("Dolce")) {
            menu.get(3).add(new Dish(type, "", cost));
        } else if (type.equals("Pizza")) {
            menu.get(4).add(new Dish(type, "", cost));
        }
    }
    public void printMenu() {
        for (ArrayList<Dish> category : menu) {
            for (Dish dish : category) {
                System.out.println(dish.getNome() + " - " + dish.getDescrizione() + " - " + dish.getCosto());
            }
        }
    }
    public static Menu getInstance() {
        if(instance == null)
            instance = new Menu();
        else
            return instance;
        throw new UnsupportedOperationException("Unimplemented method 'getInstance'");
    }
}
