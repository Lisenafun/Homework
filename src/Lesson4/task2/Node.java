package Lesson4.task2;

import java.util.Iterator;

public class Node {
    private int element;
    private Node next;
    public Node() {
    }

    public Node(int element, Node next) {
        this.element = element;
        this.next = next;
    }
    public Node(int element) {
        this.element = element;
        this.next = null;
    }
    public Node(Node next) {
        this.element = 0;
        this.next = next;
    }

    public int getElement(){
        return element;
    }
    public Node getNext() {
        return next;
    }

    public void setElement(int element) {
        this.element = element;
    }
    public void setNext(Node next) {
        this.next = next;
    }

     public void add(int e) {
        if (element == 0) {
            this.element = e;
        } else {
            if (this.next == null) {
                this.next = new Node(e);
            } else {
                this.next.add(e);
            }
        }
    }
    public void remove(int e){
            if (this.element == e) {
                this.element = this.next.getElement();
                this.next = this.next.getNext();
            } else if(this.next.getElement() == e){
                this.next= this.next.getNext();
        } else {
                this.next.remove(e);
            }
    }

    @Override
    public String toString() {
        return "Node{" +
                "element=" + element +
                ", next=" + next +
                '}';
    }
}
