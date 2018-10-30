package lesson6.linkedList;

public class LinkedList implements List, Queue, Stack{
    private Object first;
    private Object last;
    private int size;
    private int index;

    public LinkedList() {
        this.first = null;
        this.last = null;

    }

    public LinkedList(Object first) {
        this.first = first;
        this.last = null;
    }
    public LinkedList(Object first, Object last) {
        this.first = first;
        this.last = last;
    }

    public Object getFirst() {
        return first;
    }

    public void setFirst(Object first) {
        this.first = first;
    }

    public Object getLast() {
        return last;
    }

    public void setLast(Object last) {
        this.last = last;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public void add(Object obj, int index) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int size() {
        return this.size = size;
    }

    @Override
    public void shift(Object obj) {

    }

    @Override
    public void unshift() {

    }

    @Override
    public void push(Object obj) {
        if (this.first == null) {
            this.first = obj;
        } else {
            if (this.last == null) {
                this.last = new LinkedList(obj);
            } else {

            }
        }
    }

    @Override
    public void pop() {

    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "first='" + first + '\'' +
//                ", next='" + next + '\'' +
                ", last='" + last + '\'' +
                '}';
    }
}
