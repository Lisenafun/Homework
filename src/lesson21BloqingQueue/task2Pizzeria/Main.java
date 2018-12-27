package lesson21BloqingQueue.task2Pizzeria;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue<Order> ordersClient = new LinkedBlockingQueue<> (3);
        LinkedBlockingQueue<Order> ordersWaiter = new LinkedBlockingQueue<> (3);
        LinkedBlockingQueue<Order> ordersCooker = new LinkedBlockingQueue<> (3);
        Cooker cooker = new Cooker (ordersClient,ordersWaiter);
        Waiter waiter = new Waiter (ordersWaiter,ordersCooker);
        for (int i = 0; i < 3; i++) {
           new Client (ordersClient,ordersCooker).start ();
        }
        waiter.start ();
        cooker.start ();
    }
}
