package MyOwnPractice;

public class Mains {
    public static void main(String[] args) {
        B obj = new B ();
        obj.method();
        obj.method1();
    }

}
class A{
    void method(){
        System.out.println("Class A");
    }
}
class B extends A {
    void method1 (){
        System.out.println("Class B");
    }

}

