package lesson21BloqingQueue.task2Pizzeria;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;

public class Cooker extends Thread{
    private LinkedBlockingQueue<Order> ordersWaiter;
    private LinkedBlockingQueue<Order> ordersCooker;
    private Order order;

    public Cooker(LinkedBlockingQueue<Order> ordersWaiter, LinkedBlockingQueue<Order> ordersCooker) {
        this.ordersWaiter = ordersWaiter;
        this.ordersCooker = ordersCooker;
    }

    @Override
    public void run() {
            try {
                ordersCooker.put (ordersWaiter.take ());
                System.out.println ("Заказ на кухне: " + Thread.currentThread ().getName () + " " + order);
                System.out.println (ordersCooker);
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }
    }
