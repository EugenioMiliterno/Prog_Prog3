package Progetto;
import java.util.ArrayList;
import java.util.List;

// The Command interface
interface OrderCommand {
    void execute();
}

// Concrete Command classes
class AddItemCommand implements OrderCommand {
    private final Order order;
    private final Item item;

    public AddItemCommand(Order order, Item item) {
        this.order = order;
        this.item = item;
    }

    @Override
    public void execute() {
        order.addItem(item);
    }
}

class RemoveItemCommand implements OrderCommand {
    private final Order order;
    private final Item item;

    public RemoveItemCommand(Order order, Item item) {
        this.order = order;
        this.item = item;
    }

    @Override
    public void execute() {
        order.removeItem(item);
    }
}

// The Receiver class
class Order {
    private final List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
        System.out.println("Added item " + item.getName() + " to order.");
    }

    public void removeItem(Item item) {
        items.remove(item);
        System.out.println("Removed item " + item.getName() + " from order.");
    }
}

// The Invoker class
class Waiter {
    private final List<OrderCommand> commands = new ArrayList<>();

    public void takeOrder(OrderCommand command) {
        commands.add(command);
    }

    public void placeOrders() {
        for (OrderCommand command : commands) {
            command.execute();
        }
        commands.clear();
    }
}

// The Client class
class Client {
    public static void main(String args[]){
        System.out.println("Arriva cliente\n");
    }
}

// The Item class
class Item {
    private final String name;
    private final double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
