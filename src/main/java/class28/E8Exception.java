package class28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E8Exception {
    public static void main(String[] args) {
        try{
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Denys\\IdeaProjects\\SDETJavaBatch16\\Files\\Emp.xlsx");
        } catch (FileNotFoundException foundException){
            System.out.println("Hey the file that you are trying to read is not found on the address specified");
        }
    }
}
