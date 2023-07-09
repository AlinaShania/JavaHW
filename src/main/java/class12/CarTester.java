package class12;

public class CarTester {
    public static void main(String[] args) {

        Car car = new Car ();
        car.make="Toyota";
        car.model="Prius";
        car.color="White";
        car.year=2023;
        car.isAutomatic=true;
        car.playMusic();
        car.move();
        car.setHorsePower();

        Car car1 = new Car();
        car1.make="Tesla";
        car1.model="s";
        car1.color="Black";
        car1.isAutomatic=true;
        car.move();
    }
}
