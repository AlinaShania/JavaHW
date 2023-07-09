package MyOwnPractice;

public class HW {
    public static void main(String[] args) {

        double num1 = 15;
        double num2 = 20;
        if (num1 > num2) {
            System.out.println("Double number " + num1 + " is greater than" + num2);
        } else {
            System.out.println("Double number " + num2 + " is greater than " + num1);
        }
        int temperature = 76;
        if (temperature <= 32) {
            System.out.println("Water will freeze with temperature ");
        } else {
            System.out.println("Water will not freeze ");
        }

        int expectedHours=20;
        int actualHours=5;

        if(expectedHours>actualHours){
            System.out.println("U will love the code and you will succeed");
        }
        else{
            System.out.println("course will be very hard for you");
        }

    }
}
