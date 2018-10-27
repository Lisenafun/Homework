package Lesson4.task2;

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

    public int getElement(){
        return element;
    }
    public Node getNext() {
        return next;
    }

    public void setElement(int element) {
        this.element = element;
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
    public void removeElement(){
        element = 0;
    }
    public void removeLast(){
        next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "element=" + element +
                ", next=" + next +
                '}';
    }
}
