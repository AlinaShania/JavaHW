package class2;

public class Variables {
    public static void main(String[] args) {
        String name="Alina";
        String lastName="Shania";
        String grade="A+";
        String city="Mclean";
        String state="Virginia";
        String phoneNumber="240-665-5099";

        System.out.println("My name is "+name+" "+"and my last name is "+lastName);
        System.out.println("I am an "+grade+" " +"student");
        System.out.println("I live in "+city+" "+"state"+" "+state);
        System.out.println("And my Phone Number is "+phoneNumber);

        city="Rockville";
        state="Maryland";
        phoneNumber="240-666-5099";
        grade="B+";

        System.out.println("My name is "+name+" "+"and I moved to "+city+" "+", state of "+state+". My new phone number is "+phoneNumber);



    }
}
