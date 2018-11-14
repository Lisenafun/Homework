package lesson11Sint.dogs3Task;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog ("Тузик");
        Dog dog2 = new Dog ("Nord", 5, 5);
        Dog dog3 = new Dog ("Big",10);
        Dog dog4 = new Dog (5,"Black");
        Dog dog5 = new Dog (4,"White","Paris,Champ Elysee,4");
        System.out.println (dog1.getDogCount ());
        System.out.println (dog1.toString ());
        System.out.println (dog2.toString ());
        System.out.println (dog3.toString ());
        System.out.println (dog4.toString ());
        System.out.println (dog5.toString ());

    }
}
