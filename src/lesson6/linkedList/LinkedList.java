package lesson6.linkedList;

public class LinkedList<E>
        implements Stack{

    private ListElement first;
    private ListElement last;
    private static int index;
    private int size;

    public LinkedList() {
    }

    public LinkedList(ListElement first, ListElement last) {
        this.first = first;
        this.last = last;
    }
    public class ListElement<E>{
        ListElement next;
        E object;
    }
    @Override
    public void push (Object obj) {
        ListElement a = new ListElement();
        a.object = obj;
        if (last == null) {
            first = a;
            last = a;
        } else {
            last.next = a;
            last = a;
        }
    }

    @Override
    public void pop() {

    }
    public void print (){
        ListElement t = first;
        System.out.print ("{ ");
        if (t == null) {
            System.out.println (t + " ");
        } else {
            while (t != null) {
                System.out.print (t.object + " ");
                t = t.next;
            }
        }
        System.out.print ("}" + "\n");
    }
}
