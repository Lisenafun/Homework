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

    public void setNext(Node next) {
        this.next = next;
    }

    public void add(int e) {
        if (element == 0) {
            this.element = e;
        }else {
            if(next == null) {
            next = new Node(e,next= new Node());
            setNext(next);
            }
            else{
                setNext(next = new Node(e,null));
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
