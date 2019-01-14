package lesson21BloqingQueue.task1Top100;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;

public class Favor implements Runnable{
    private File file;
    private LinkedBlockingQueue<String> queueLineWords;
    private LinkedBlockingQueue<Map> queueMap;
    private CountDownLatch latch;
    private int countThread;

    public Favor(File file, LinkedBlockingQueue<String> queueLineWords, LinkedBlockingQueue<Map> queueMap
            ,CountDownLatch latch
                 ,int countThread
    ) {
        this.file = file;
        this.queueLineWords = queueLineWords;
        this.queueMap = queueMap;
        this.latch = latch;
        this.countThread = countThread;
    }

    public void readAndPut(){
        try(RandomAccessFile reader = new RandomAccessFile (file,"rw")) {
            String line;
            int countThread = Runtime.getRuntime().availableProcessors();
            long partLength =  (file.length ()%countThread==0)? file.length ()/((long)countThread):(file.length ()/((long)countThread))+1;
            long stopLength = 0;
            while ((line = reader.readLine ()) != null) {
                queueLineWords.put (line);
                if(reader.getFilePointer () == partLength+stopLength) {
                    queueLineWords.put ("StopWord");
                    stopLength = partLength+stopLength;
//                    partLength = partLength*2;
                }
                if(reader.getFilePointer () == file.length ()){
                    queueLineWords.put ("StopWord");
                }
}
        }catch (IOException | InterruptedException e) {
                e.printStackTrace ();
                }
    }

//    public void readAndPut(){
//        try(RandomAccessFile reader = new RandomAccessFile (file,"rw")) {
//            String line;
////            int countThread = Runtime.getRuntime().availableProcessors();
//            reader.seek (0);
//            while ((line = reader.readLine ()) != null) {
//                queueLineWords.put (line);
//                if(reader.getFilePointer () == file.length ()){
//                    queueLineWords.put ("StopWord");
//                }
//            }
//        }catch (IOException | InterruptedException e) {
//            e.printStackTrace ();
//        }
//    }
    public void takeMapAndResult(){
        Map<String,Integer> mapResult = new LinkedHashMap<> ();
        try {
            Map<String,Integer> mapWord = queueMap.take ();
            for (Map.Entry<String,Integer> entry: mapWord.entrySet ()) {
                if(mapResult.containsKey (entry.getKey ())){
                    mapResult.put (entry.getKey (),mapResult.get (entry.getKey ())+entry.getValue ());
                }else{
                    mapResult.put (entry.getKey (),entry.getValue ());
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
        for (Map.Entry<String, Integer> entry : mapResult.entrySet()) {
            String word = entry.getKey();
            Integer count = entry.getValue();
        }
    }

    @Override
    public void run() {
        try {
            readAndPut ();
            latch.await ();
            takeMapAndResult ();
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }

    }
}
