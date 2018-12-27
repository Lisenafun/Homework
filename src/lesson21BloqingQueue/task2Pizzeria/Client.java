package lesson21BloqingQueue.task2Pizzeria;

import java.util.concurrent.LinkedBlockingQueue;

public class Client extends Thread{
    private LinkedBlockingQueue<Order> ordersClient;
    private LinkedBlockingQueue<Order> ordersCooker;
    private Order order = new Order ();

    public Client(LinkedBlockingQueue<Order> ordersClient, LinkedBlockingQueue<Order> ordersCooker) {
        this.ordersClient = ordersClient;
        this.ordersCooker = ordersCooker;
    }

    @Override
    public void run() {
            try {
                ordersClient.put (order);
                System.out.println ("Заказ оформляется " + Thread.currentThread ().getName () +" " + order);
                System.out.println (ordersClient);
                Thread.sleep (2000);
                ordersCooker.take ();
                System.out.println ("Забрали готовый заказ: " + Thread.currentThread ().getName () + " " + order);
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
    }
}

