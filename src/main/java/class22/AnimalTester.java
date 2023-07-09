package class22;

public class AnimalTester {
    public static void main(String[] args) {
        Animalss[] animals = {new Dog("jacky", "black","unknown"), new Cat ("tom","blue","persian")};
        for (Animalss animal : animals){
            animal.eat();
            animal.sleep();
            animal.speak();

        }
    }
}
