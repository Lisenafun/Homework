package lesson11Col.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyList<> ();
        Scanner in = new Scanner (System.in);
        for (int i = 0; i < 5; i++) {
            list.add (in.nextLine ());
        }
        System.out.println (list.toString ());
        System.out.println (list.isSorted ());
    }
}
