package Lesson4.task2;

public class Main {
    public static void main(String[] args) {
        Node list = new Node();
        Node list2 = new Node();
        System.out.println(list.toString());
        list.addElement(15);
        list.addNext(list2);
        System.out.println(list.toString());
        list2.addElement(10);
        System.out.println(list.toString());
        list2.removeElement();
        System.out.println(list.toString());
        list.removeLast();
        System.out.println(list.toString());

    }
}
