package class23;

public interface MoveAble {

    void move ();
}
interface WashAble{
    void wash();

}

class Dog implements MoveAble, WashAble {
    public void move (){
        System.out.println("Dog is moving....");
    }

    @Override
    public void wash() {
        System.out.println();
    }
}
class Cat implements MoveAble{
    @Override
    public void move() {
        System.out.println("Cats are also moving....");
    }
}
class Horse implements MoveAble {
    public void move (){
        System.out.println("Horses are moving");
    }
}