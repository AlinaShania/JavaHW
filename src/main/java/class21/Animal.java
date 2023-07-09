package class21;

public class Animal {
    String name;
    String color;
    String breed;

     public Animal(String name, String color, String breed) {
         this.name = name;
         this.color = color;
         this.breed = breed;
     }

     void printInfo (){
        System.out.println(name+ " "+color+" "+breed);
    }
    void speak (){
        System.out.println("Animal speaks");
    }
    void sleep (){
        System.out.println("Animal Sleeps");
    }
    void eat (){
        System.out.println("Animal eats");
    }
}

class Cat extends Animal{
    public Cat(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak (){
        System.out.println("meoww");
    }
    @Override
    void eat (){
        System.out.println("Cat likes fish");
    }
    @Override
    void sleep (){
        System.out.println("Cat sleeps a lot of hours");
    }
}
 class Dog extends Animal {
     public Dog(String name, String color, String breed) {
         super(name, color, breed);

     }
     @Override
     void speak (){
         System.out.println("woof woof");
     }

     @Override
     void printInfo() {
         super.printInfo();
     }
     @Override
     void sleep () {
         System.out.println("Dogs sleep 8 hours");
     }
     @Override
     void eat (){
         System.out.println("Dogs like to chew the bones");
     }
     void run(){
         System.out.println("Dog is running");
     }

 }
class Horse extends Animal {
    public Horse(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak (){
        System.out.println("nei neigh");
    }
    @Override
    void sleep (){
        System.out.println("Horse sleeps 9 hours");
    }
    @Override
    void eat (){
        System.out.println("Horse eats grass");
    }
}
class AnimalTester {
    public static void main(String[] args) {
        Dog dog = new Dog ("Kuzia","white", "husky");
        dog.printInfo();

        Animal dog1 = new Dog ("cookie","red","chinese");
        dog1.printInfo();

        Animal [] animals = { new Dog ("kuzia","white","chineese"), new Cat("tom","brown","persian")};
        for (Animal animal : animals){
            animal.printInfo();
        }
    }

}