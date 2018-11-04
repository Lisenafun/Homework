package lesson6.linkedList;

public class LinkedList<E>
        implements Stack, Queue, List{

    private ListElement first;
    private ListElement last;
    private int size;

    public LinkedList() {
    }

    public LinkedList(ListElement first, ListElement last) {
        this.first = first;
        this.last = last;
    }

    public class ListElement<E>{
        E object;
        ListElement next;
        int index;

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        @Override
        public String toString() {
            return "ListElement{" +
                    "object=" + object +
                    ", next=" + next +
                    '}';
        }
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
        ListElement a = first;
        if (first == last) {
            first = null;
            last = null;
            return;
        }
        while(a.next != last & a.next.next != null) {
            a = a.next;
        }
        if (a.next == last & a.next.next == null){
            last = a;
            a.next = a.next.next;
        }
    }

    @Override
    public void shift(Object obj) {
        ListElement a = new ListElement();
        a.object = obj;
        if (first == null) {
            first = a;
            last = a;
        } else {
            a.next = first;
            first = a;
        }
    }

    @Override
    public void unshift() {
        if (first == null) {
            return;
        }
        if (first == last) {
            first = null;
            last = null;
            return;
        }
        if(first != null){
            first.object = first.next.object;
            first = first.next;
        }
    }

    @Override
    public void add(Object obj, int index) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public Object get(int index) {
        if(index <1){
            return null;
        }
        ListElement a = first;
        a.index = 1;
        for (int i = 1; i < index; i++) {
            a = a.next;
            if(a == null){
                return null;
            }
            a.index++;
        }
        return a.object;
    }

    @Override
    public int size() {
        return 0;
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

    @Override
    public String toString() {
        return "LinkedList{" +
                "first=" + first +
                ", last=" + last +
                '}';
    }
}
