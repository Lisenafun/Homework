package lesson21BloqingQueue.task1Top100;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int countThread = Runtime.getRuntime().availableProcessors();
//        int countThread = 1;
        CountDownLatch latch = new CountDownLatch(countThread);
        LinkedBlockingQueue<String> queueLineWords = new LinkedBlockingQueue<> (20);
        LinkedBlockingQueue<Map> queueMap = new LinkedBlockingQueue<> ();
        new Thread (new Favor (new File ("file.txt"),queueLineWords,queueMap, latch, countThread)).start ();
//        new Thread (new Worker (queueLineWords,queueMap, latch)).start ();
        for (int i = 0; i < countThread; i++) {
            new Thread (new Worker (queueLineWords, queueMap, latch)).start ();
        }
/*      Используя блокирующие очереди сосчитать топ слов как из предыдущего задания.
        Вариантом решения может быть:
        main создает потоки Worker, которые ждут строки из очереди на методе take().
        Далее main читает с диска и добавляет строки в очереди, последними строками будут стоп-строки.
        Worker'ы при получении стоп-строки добавляют свою внутреннюю мапу в следующую очередь
        и завершают свою работу.
        main же ждет мапы со всех воркеров на второй очереди и результат собирает в результирующую мапу.
        В итоге, не должно быть нигде явной синхронизации и использованы две блокирующие очереди*/
    }
}
