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
    public void remove(int value){
        for (int i = 0; i < 1; i++) {
            if (this.element == value) {
                this.element = this.next.getElement();
                this.next = this.next.getNext();
                break;
            } else if(this.element != value){
//                this.next.getElement() = value
            }i--;
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
