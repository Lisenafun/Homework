package lesson4.task2;

public class Main {
    public static void main(String[] args) {
        Node list = new Node();
        list.add(11);
        System.out.println(list.toString());
        list.add(13);
        System.out.println(list.toString());
        list.add(15);
        System.out.println(list.toString());
        list.add(17);
        System.out.println(list.toString());
        list.add(19);
        System.out.println(list.toString());
        list.remove(15);
        System.out.println(list.toString());



    }
}
