package class17;

public class Task1 {

    String country;
   Task1 (String faveCountry){
       country = faveCountry;
       System.out.println("My favorite country is "+ faveCountry);
   }
   Task1 (){
       System.out.println("no arg constr");
   }
    void printInfo(){
        System.out.println(country);
    }

}
