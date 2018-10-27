package Lesson4.task2;

public class Main {
    public static void main(String[] args) {
        Node list = new Node();
        Node list2 = new Node();
        list.add(11);
        System.out.println(list.toString());
        list.add(13);
        System.out.println(list.toString());
//        list.setNext(list2);
        list.add(15);
        System.out.println(list.toString());


    }
}
