package class21;

public class E1Poly {
    public static void main(String[] args) {
        Animal [] animals = {new Dog("Vasia","white","german"),
                new Cat ("kolia","white", "persian"),
        new Horse("Petia","black","some")};

        for (Animal animal : animals){
            animal.speak();
            animal.eat();
            animal.sleep();
;        }
        Animal animal = new Dog("Vasia","white","german");
       // ((Dog).animal).run();



    }
}
