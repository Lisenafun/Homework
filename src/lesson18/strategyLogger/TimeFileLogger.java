package lesson18.strategyLogger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
//записывает сообщение в файл + текущее время
public class TimeFileLogger implements ILogger {
    private Date date = new Date ();

    @Override
    public void write(String message) {
        File newfile = new File("newfile.txt");
        try(FileWriter fw = new FileWriter (newfile)){
            if(!newfile.exists ()) newfile.createNewFile ();
            fw.write (message + "\n" + date.toString ());
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
