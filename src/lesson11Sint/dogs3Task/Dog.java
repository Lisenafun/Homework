package lesson11Sint.dogs3Task;

public class Dog {

    private String name;
    private int weight;
    private int age;
    private String colour;
    private String address;
    private String houseDog = "Это домашняя собака";
    private String streetDog = "Это бродячая собака";
    private static int dogCount;


    public Dog(String name) {
        this.name = name;
        dogCount++;
    }

    public Dog(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        dogCount++;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 5;
        dogCount++;
    }

    public Dog(int weight, String colour) {
            this.weight = weight;
            this.colour = colour;
        dogCount++;
    }
    public Dog(int weight, String colour, String address) {
        this.weight = weight;
        this.colour = colour;
        this.address = address;
        dogCount++;
    }
    public int getDogCount(){
        return dogCount;
    }

    @Override
    public String toString() {
        if(this.name == null & this.age == 0&this.address != null){
            return "Dog{" +
                    houseDog +
                    '}';
        }
        if(this.name == null & this.age == 0 & this.address == null){
            return "Dog{" +
                    streetDog +
                    '}';
        }else {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", weight=" + weight +
                    ", age=" + age +
                    ", colour='" + colour + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }
    }
}
