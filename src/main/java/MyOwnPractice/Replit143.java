package MyOwnPractice;

public class Replit143 {
}
class Car {
    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;

    Car (String make,String model, int numberOfDoors, int topSpeed, double price){
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }
    Car (String make, String model, int topSpeed,double price){
        this.make = make;
        this.model = model;
        this.topSpeed = topSpeed;
        this.price = price;
        numberOfDoors = 4;
    }
    Car (int numberOfDoors, int topSpeed, double price){
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
        make = "unknown";
        model = "unknown";
    }
    Car (String make,String model, int numberOfDoors){
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        topSpeed = 90;
        price = 0;
    }
    void display(){
        System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
    }

    public static void main(String[] args) {
        Car obj1 = new Car("Toyota","Prius",4,120,30000.0);
        Car obj2 = new Car("Toyota", "Prius", 120,30000.0);
        Car obj3 = new Car(4,120,30000.0);
        Car obj4 = new Car("Toyota", "Prius", 4);
        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();
    }

}