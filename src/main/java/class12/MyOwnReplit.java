package class12;

class Main {



    String Color;
    int Year;
    String Make;


    public static void main (String [] args){

        Main car = new Main ();

        car.Color="Black";

        car.Year=2019;

        car.Make="BMW";
        System.out.println ("Car color is "+car.Color+" and car year is "+car.Year+" and car model is "+car.Make);

        Main car1 = new Main ();

        car1.Color="White";

        car1.Year=2018;

        car1.Make="Toyota";
        System.out.println ("Car color is "+car1.Color+" and car year is "+car1.Year+" and car model is "+car1.Make);

    }
}