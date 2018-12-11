package lesson18.xorDecorator;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        byte[] password = {1,2,3,4,5};
        String nameFile = "file.txt";
        String string = "Привет";
        byte[] stringBytes = string.getBytes ("UTF-8");
            try(DecryptOutputStream out = new DecryptOutputStream (new FileOutputStream(nameFile),password);
                IncryptInputStream in = new IncryptInputStream (new FileInputStream(nameFile),password);){
                out.write(stringBytes);
                byte[] stringBytes2 = new byte[in.available()];
                in.read(stringBytes2);
                String string2 = new String(stringBytes2, "UTF-8");
                System.out.println(string2);
            }
    }
}
