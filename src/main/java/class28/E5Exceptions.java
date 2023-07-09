package class28;

public class E5Exceptions {
    public static void main(String[] args) {
        System.out.println("line 1");
        System.out.println("line 2");
        System.out.println("line 3");
      //  System.out.println(10/0);
        try{
        "name".charAt(0);

        int [] arr= new int [-5];
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("Plan b");
        } catch (NegativeArraySizeException e){
            System.out.println("Plan c");
        }

       //int [] arr = new int[-5];
    }
}
