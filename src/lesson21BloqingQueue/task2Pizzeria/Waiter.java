package lesson21BloqingQueue.task2Pizzeria;

import java.util.concurrent.LinkedBlockingQueue;

public class Waiter extends Thread{
    private LinkedBlockingQueue<Order> ordersClient;
    private LinkedBlockingQueue<Order> ordersWaiter;
    private Order order;

    public Waiter(LinkedBlockingQueue<Order> ordersClient, LinkedBlockingQueue<Order> ordersWaiter) {
        this.ordersClient = ordersClient;
        this.ordersWaiter = ordersWaiter;
    }

    @Override
    public void run() {
            try {
                order = ordersClient.take ();
                ordersWaiter.put (order);
                System.out.println ("Заказ принят: " + Thread.currentThread ().getName () +" " + order);
                System.out.println (ordersWaiter);
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
    }
}
