package class20;

import class18.Animal;

public class Animals {
    String name;
    String color;
    int age;
    public Animals (String name, String color, int age){
this.name = name;
this.color = color;
this.age = age;

    }

    void eats (){
        System.out.println("nom nom nom");
    }
    void sleeps (){
        System.out.println("zzzz");
    }
    void runs (){
        System.out.println("ooohooo");
    }
}
class Dog extends Animals{

    Dog( String name, String color, int age){

        super(name, color, age);
    }
    @Override

    void sleeps (){
        System.out.println("I LIKE TO SLEEP 10.6 HOURS A DAY");
    }
}
class Cat extends Animals {

    Cat (String name, String color, int age){
        super (name, color, age);
    }
}
class Horse extends Animals {

    Horse (String name, String color, int age){
        super(name, color, age);
    }
}
