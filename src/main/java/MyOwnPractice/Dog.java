package MyOwnPractice;

public class Dog {
    String dogName;
    double dogWeight;
   static String dogBreed = "Mutt";
   void method (){
       System.out.println(dogName+" "+dogBreed+" "+dogWeight);
   }


    Dog (String dogName,  double dogWeight){
        this.dogName = dogName;
        this.dogWeight = dogWeight;

    }

    public static void main(String[] args) {
        Dog obj1 = new Dog("Tarzan",50.0);
        Dog obj2 = new Dog ("Lucy",10.0);
        obj1.method();
        obj2.method();
    }
}
