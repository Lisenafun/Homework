package lesson6.linkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
//        list.print ();
        list.push("Привет");
        list.print ();
        list.push(15);
        list.print ();
        list.push(23);
        list.print ();
        list.push("Hello");
        list.print ();
    }
}
