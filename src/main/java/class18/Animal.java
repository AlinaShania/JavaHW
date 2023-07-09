package class18;

public class Animal {
    String name;
    String color;
    String breed;
    int age;
    double weight;
    void printInfo(){
        System.out.println(name+" "+color+" "+breed+" "+age+" "+weight);
    }
    public Animal(String name, String color, String breed, int age, double weight) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

}
class Dogs extends Animal{
    double price;
    public Dogs (String name, String color, String breed, int age, double weight) {
       super (name, color, breed, age, weight);
       this.price=price;
    }

    void printInfo (){
        super.printInfo();
        System.out.println(price); //adding info to the main void method in parent class
    }
}
class Cats extends Animal {
    double price;

    public Cats(String name, String color, String breed, int age, double weight) {
        super(name, color, breed, age, weight);
        this.price = price;
    }
}
class AnimalTesters{
    public static void main(String[] args) {
        Dogs dog = new Dogs("Tom", "Black","persian", 10,20);
        dog.printInfo();
    }
}

