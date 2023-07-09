package class3;

public class E14TypeCasting {
    public static void main(String[] args) {

        short num=1200;
      //  byte num2=num; error
        byte num2=(byte)num;
        System.out.println(num2);

        short num1=126;
        byte num3=(byte)num;
        System.out.println(num1);

    }
}
