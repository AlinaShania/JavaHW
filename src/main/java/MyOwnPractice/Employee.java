package MyOwnPractice;

public class Employee {
    String name;
    String lastName;
    int employeeID;
    String startDate;
    int salary;
    void method (){
        System.out.println(name+" "+lastName+" "+employeeID+" "+startDate+" "+salary);
    }

    Employee(){

    }
    Employee(String name, String lastName, int employeeID, String startDate, int salary){
        this.name = name;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.startDate = startDate;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee obj1 = new Employee();
        Employee obj2 = new Employee("Joe", "Smith", 12345, "01/01/1970", 35000);
        obj1.method();
        obj2.method();
    }

}
