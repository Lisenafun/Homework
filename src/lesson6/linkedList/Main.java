package lesson6.linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push("Привет");
        System.out.println(list.toString());
        list.push(15);
        System.out.println(list.toString());
        list.push(23);
        System.out.println(list.toString());
//        list.push("Hello");
//        System.out.println(list.toString());
    }
}
