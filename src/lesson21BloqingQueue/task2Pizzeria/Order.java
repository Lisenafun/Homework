package lesson21BloqingQueue.task2Pizzeria;

public class Order{
    private String name = "Заказ";

    public Order() {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{" + name + '}';
    }
}
