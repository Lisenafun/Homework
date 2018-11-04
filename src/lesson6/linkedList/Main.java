package lesson6.linkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push("Привет");
        list.print ();
        list.push(15);
        list.print ();
        list.push(23);
        list.print ();
        list.shift("Hello");
        list.print ();
        System.out.println (list.get (3));
        System.out.println (list.size ());
        list.add ("Bye",3);
        list.print ();
        System.out.println (list.size ());
        list.add ("456",1);
        list.print ();
        System.out.println (list.size ());
        list.remove (2);
        list.print ();
        System.out.println (list.size ());
        System.out.println (list.get(1));



    }
}
