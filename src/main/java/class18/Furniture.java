package class18;

import javax.management.MBeanAttributeInfo;

public class Furniture {
    String color = "Black";
}
class Chair extends Furniture {
    String color = "White";
    void printColor (){
        String color = "Blue";
        System.out.println(this.color);
    }
}
class FurnitureTESTER {
    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.printColor();
    }
}