package lesson6.linkedList;

import java.util.Arrays;

public class LinkedList<E>
        implements Stack, Queue, List{

    private ListElement first;
    private ListElement last;
    static int size = 0;

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
                    " object=" + object +
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
        size++;
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
        size--;
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
        size++;
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
        size--;
    }

    @Override
    public void add(Object obj, int index) {
        if (index < 0 || index > size) {
            System.out.println ("Такого индекса не существует, проверьте размер списка");
        }
        if (index == size) {
            push (obj);
            return;
        }
      ListElement t = first;
        int lengthO = size;
        Object [] objects = new Object[lengthO+1];
        for (int i = 0; i < objects.length; i++) {
            objects[i] = t.object;
            if(i == index){
                objects[i++] = obj;
                objects[i] = t.object;
            }
            t = t.next;
            size--;
        }
            this.first = null;
            this.last = null;
//        System.out.println (Arrays.toString (objects));
        for (int i = 0; i < objects.length; i++) {
            this.push (objects[i]);
        }
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index > size-1) {
            System.out.println ("Такого индекса не существует, проверьте размер списка");
            return;
        }
        if(index == 0){
            unshift ();
            return;
        }
        if(index == size-1){
            pop ();
            return;
        }
        ListElement t = first;
        for (int i = 1; i < size-1; i++) {
            t = t.next;
            if (i == index) {
                t.object = t.next.object;
                t.next = t.next.next;
            }
        }
        size--;
    }

    @Override
    public Object get(int index) {
        if(index <1){
            return null;
        }
        ListElement a = first;
        a.index = 0;
        for (int i = 0; i < index; i++) {
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
        return size;
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
