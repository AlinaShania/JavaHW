package MyOwnPractice;

public class ShoppingStore {
    String item;
    double price;
    int quantity;
    ShoppingStore (String item, double price, int quantity){
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }
    void itemTotalPrice(){
        double totalValue = price*quantity;
        System.out.println(item+" Total Value "+totalValue);
    }

    public static void main(String[] args) {
        ShoppingStore obj1 = new ShoppingStore("Blanket",49.99,2);
        ShoppingStore obj2 = new ShoppingStore("Mattress", 439.18,1);
        obj1.itemTotalPrice();
        obj2.itemTotalPrice();
        double price1 = 99.98;
        double price2 = 439.18;

        System.out.println("You purchased "+(price1+price2)+" Today");
    }

}
