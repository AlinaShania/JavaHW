package class18;

public class A {
    static void printF(){
        System.out.println("Hello");
   }
}
class B extends A {
    public static void main(String[] args) {
        A.printF();
    }
}
class C extends B {

}
