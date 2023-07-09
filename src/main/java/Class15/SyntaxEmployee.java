package Class15;

import javax.management.MBeanAttributeInfo;

public class SyntaxEmployee {


    String empID;
    double salary;
    static String CEO;

    public static void main(String[] args) {

        SyntaxEmployee obj = new SyntaxEmployee();
        obj.empID = "DA142524254";
        obj.salary = 4999.9;
        System.out.println(obj.CEO); //not a preffered way
        System.out.println(SyntaxEmployee.CEO);


        SyntaxEmployee obj1 = new SyntaxEmployee();
        obj1.empID = "DE35625625";
        obj1.salary = 6878.50;
        System.out.println(obj1.empID);
        System.out.println(SyntaxEmployee.CEO);
        System.out.println(obj1.salary);

    }

}
