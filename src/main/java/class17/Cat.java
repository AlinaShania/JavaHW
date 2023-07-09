package class17;

public class Cat {

    String name;
    Cat (String catName){
        name = catName;
        System.out.println("fffffff");
    }
    Cat (int cageCat){
        System.out.println("int arg con");
    }

    Cat (double weight){
        System.out.println("double arg constr");
    }
    Cat (){
        System.out.println("odjdfkjfkj");
    }
    void printInfo()
    {
        System.out.println(name);
    }
    public static void main(String[] args) {

        Cat cat = new Cat (2.5);
        cat.printInfo();
    }
}
