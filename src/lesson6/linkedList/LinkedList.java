package lesson6.linkedList;

public class LinkedList implements List, Queue, Stack{
    private Object first;
    private Object next;
    private Object last;

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

    public Object getNext() {
        return next;
    }

    public void setNext(Object next) {
        this.next = next;
    }

    public Object getLast() {
        return last;
    }

    public void setLast(Object last) {
        this.last = last;
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
        return 0;
    }

    @Override
    public void shift(Object obj) {

    }

    @Override
    public void unshift() {

    }

    @Override
    public void push(Object obj) {
        if(this.first == null){
            this.first = obj;
        } else if (this.last == null){
            this.last = new LinkedList(obj);
        } else if (this.first != null & this.last !=null){
            this.last = this.getLast();

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
