package class13;

public class Task3 {
    public static void main(String[] args) {

        //Create a String that should be combination of letters, numbers and special characters.
        // Find out how many Alphanumeric(abd AZ 284) characters are there in the String.

        String str = "hfu759###&*&5$dgliuol'^)ool";
        String str1 = str.replaceAll("[^A-Za-z0-9]", "");
        System.out.println(str1);
        System.out.println(str1.length());
    }
}
