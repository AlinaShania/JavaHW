package Class15;

public class Dog {

    String name;
    String color;
    int age;
    static double weight;

    public static void main(String[] args) {

        Dog dog = new Dog ();
        dog.color="green";
        dog.weight=20;


        Dog dog1 = new Dog();
        System.out.println(dog1.weight);
        System.out.println(dog1.color); //this will be null, because it is not static variable, it is instance
    }
}

