package lesson18.strategyLogger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//записывает сообщение в файл
public class FileLogger implements ILogger {

    @Override
    public void write(String message) {
        File newfile = new File("newfile.txt");
        try(FileWriter fw = new FileWriter (newfile)){
            if(!newfile.exists ()) newfile.createNewFile ();
            fw.write (message);
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }

}
