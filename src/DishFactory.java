package src;
public class DishFactory {
    public Dish Piatto;
    public Dish createDish(String type) {
        if (type.equals("Antipasto")) {
            Piatto = new Dish(type, "", 0);
            Menu.getInstance().getEntrees().add(Piatto);
        } else if (type.equals("Primo")) {
            Piatto = new Dish(type, "", 0);
            Menu.getInstance().getFirstCourses().add(Piatto);
        } else if (type.equals("Secondo")) {
            Piatto = new Dish(type, "", 0);
            Menu.getInstance().getSecondCourses().add(Piatto);
        } else if (type.equals("Dolce")) {
            Piatto = new Dish(type, "", 0);
            Menu.getInstance().getDesserts().add(Piatto);
        } else if (type.equals("Pizza")) {
            Piatto = new Dish(type, "", 0);
            Menu.getInstance().getPizze().add(Piatto);
        }else{
            return null;
        }
        return Piatto;
    }
}
