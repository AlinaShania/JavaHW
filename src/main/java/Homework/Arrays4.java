package Homework;

public class Arrays4 {
    public static void main(String[] args) {
        String [] carsIlike = {"BMW","AUDI","TESLA","TOYOTA","RangeRover","Mercedes"};
        for (String cars: carsIlike){
            System.out.print(cars+" ");
        }
        System.out.println();

        for (int i=0; i< carsIlike.length; i++){
            System.out.print(carsIlike[i]+" ");
        }

    }
}
