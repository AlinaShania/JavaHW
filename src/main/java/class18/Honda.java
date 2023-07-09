package class18;

public class Honda extends Cars {

}
class BMW1 extends Cars {
    void offerMpackage(){
        System.out.println("Only BMW offers the m package");
    }

}
class Audi1 extends Cars {

}
class CarTester {
    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.method1();
    }
}
