package lesson21BloqingQueue.task1Top100;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toMap;

public class Worker implements Runnable {
    private LinkedBlockingQueue<String> queueLineWord;
    private LinkedBlockingQueue<Map> queueMap;
//    private Map<String,Long> mapWord;
    private CountDownLatch latch;

    public Worker(LinkedBlockingQueue<String> queueLineWord, LinkedBlockingQueue<Map> queueMap
            , CountDownLatch latch
    ) {
        this.queueLineWord = queueLineWord;
        this.queueMap = queueMap;
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            List<String> list = new ArrayList<> ();
            if (queueLineWord.isEmpty ()){
                Thread.sleep (5000);
            }
            while(!queueLineWord.take ().equals ("StopWord")){
                list.add (queueLineWord.take ());
            }
            Map<String,Long> mapWord;
            mapWord = list.stream ()
                    .parallel ()
                    .map (line->line.toLowerCase ().replaceAll ("\\pP"," "))
                    .flatMap (line->Arrays.stream (line.split (" ")))
                    .map (String::trim)
                    .filter (word->!"".equals (word))
                    .collect (groupingBy(Function.identity (),counting ()))
                    .entrySet ().parallelStream ()
                    .limit (100)
                    .collect (toMap (Map.Entry::getKey, Map.Entry::getValue));
            for (Map.Entry<String, Long> entry : mapWord.entrySet()) {
                String word = entry.getKey();
                Long count = entry.getValue();
                System.out.println (word + " " + count);
            }
            queueMap.put (mapWord);
            latch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
    }
}
