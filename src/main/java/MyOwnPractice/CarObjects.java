package MyOwnPractice;

public class CarObjects {
    String model;
    double price;
    int quantity;

    CarObjects (String model, double price, int quantity){
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }
    void carStockValue (){
        double totalValue = price*quantity;
        System.out.println(model+" "+"Stock Vallue "+totalValue);
    }

    public static void main(String[] args) {
        CarObjects obj1 = new CarObjects("Toyota 2019",50000.0,5);
        obj1.carStockValue();
        CarObjects obj2 = new CarObjects("BMW 2019",81622.5,8);
        obj2.carStockValue();
    }
}
