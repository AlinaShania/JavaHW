package class22;

public abstract class Animalss {
   private String name;
   private String color;
    private String breed;

    public Animalss(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    abstract void speak ();
    abstract void sleep ();
    abstract void eat();
    void printInfo(){
        System.out.println(name+" "+color+" "+breed);
    }

}
class Dog extends Animalss {
    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
     void speak (){
        System.out.println("Dog Speaks");
    }
    @Override
   void sleep (){
        System.out.println("ZZzZ");
    }
    @Override
     void eat(){
        System.out.println("Dog eats");
    }
}
class Cat extends Animalss {
    public Cat(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void eat (){
        System.out.println("Cat Eats");
    }
    @Override

        void speak (){
            System.out.println("Cat Speaks");
        }
        @Override
        void sleep (){
            System.out.println("Cat eats");
    }

}
class Horse extends Animalss {
    public Horse(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak (){
        System.out.println("Horse Speaks");
    }
    @Override
    void sleep (){
        System.out.println("ZZzzzzzzzzZ");
    }
    @Override
    void eat(){
        System.out.println("Horse eats");
    }
}
