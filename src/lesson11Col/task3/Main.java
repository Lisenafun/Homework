package lesson11Col.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyList<> ();
        Scanner in = new Scanner (System.in);
        for (int i = 0; i < 3; i++) {
            list.add (in.nextLine ());
        }
        list.doubleValues ();
        list.printList ();
//        System.out.println (list.toString ());
    }
}
