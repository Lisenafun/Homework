package Lesson4.task2;

public class Node {
    //содержимое текущего элемента списка
    private int element;
    //указатель на следующий элемент списка
    private Node next;
    //вывод содержимого текущего элемента
    public int getElement(){
        return element;
    }
    //установка содержимого для текущего элемента списка
//    public void addElement(int e){
//        if(element == 0){
//            e = element;
//        } else {
//            e = ;
//        }
//    }
    //получение указателя на следующий элемент списка
    public Node getNext() {
        return next;
    }
    //установка следующего элемента списка
    public void addNext(Node n) {
        next = n;
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
