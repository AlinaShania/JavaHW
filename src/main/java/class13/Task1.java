package class13;

public class Task1 {
    public static void main(String[] args) {

        //String str = new String ("Java");
        String str ="Java"; //this is a shorter way
        if (!str.isBlank() && str.length()%2!=0 && str.length()>=3){
            int middleIndex = str.length()/2;
            char middleChar=str.charAt(middleIndex);
            System.out.println(middleChar);
        }
    }
}
