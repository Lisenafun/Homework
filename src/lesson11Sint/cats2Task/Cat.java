package lesson11Sint.cats2Task;

public class Cat {
    private String name;
    private int age;
    private int weight;
    private int strength;

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public boolean fight(Cat anotherCat){
        if(this.getAge ()< anotherCat.getAge ()&this.getStrength ()>anotherCat.getStrength ()){
            return true;
        }else if(this.getWeight ()/2 > anotherCat.getWeight ()){
            return true;
        }else if(this.getStrength ()/2 > anotherCat.getStrength ()){
            return true;
        }else{
         return false;
        }
    }
}
