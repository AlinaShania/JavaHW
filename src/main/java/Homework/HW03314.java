package Homework;

import javax.management.MBeanAttributeInfo;
import java.sql.SQLOutput;
import java.util.Scanner;

public class HW03314 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        System.out.println("Please Enter Your Grade");

        char grade = scanner.next().charAt(0);

        if (grade == 'A'){
            System.out.println(grade+ " grade is Excellent");
        } else if (grade == 'B') {
            System.out.println(grade+" grade is Good");
        } else if (grade == 'C'){
            System.out.println(grade+ " grade is Average");
        }else if (grade == 'D'){
            System.out.println(grade+ " grade is Bad");
        }else {
            System.out.println("Not Acceptable");
        }




    }

}
