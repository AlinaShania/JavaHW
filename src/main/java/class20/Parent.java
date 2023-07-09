package class20;

public class Parent {
    void getMarry (){
        System.out.println("Marry to the girl of our choice");
    }
    private void accessBankBalance(){
        System.out.println("Accessing bank");
    }
}
class Axel extends Parent {
    static void printNumber(){
        System.out.println(20);
    }
    @Override
    void getMarry() {
        super.getMarry();
    }

    private void accessBankBalance(){
        System.out.println("Accessing bank");
    }
}
class ParentTester {
    public static void main(String[] args) {
        Axel axel = new Axel();
        axel.getMarry();
        Axel.printNumber();
    }
}
