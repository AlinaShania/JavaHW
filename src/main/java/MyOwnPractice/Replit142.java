package MyOwnPractice;

public class Replit142 {
}
class SyntaxTechnologies {
    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;

    void method() {
        System.out.println(schoolName+" "+ batch+ " "+year+ " "+lastDayOfClass);
    }
    public SyntaxTechnologies(){

    }
    public SyntaxTechnologies(String schoolName, int batch, int year, String lastDayOfClass) {
        this.schoolName = schoolName;
        this.batch = batch;
        this.year = year;
        this.lastDayOfClass = lastDayOfClass;
    }

    public static void main(String[] args) {
        SyntaxTechnologies obj1 = new SyntaxTechnologies();
        obj1.method();
        SyntaxTechnologies obj2 = new SyntaxTechnologies("Syntax", 6, 2020, "07/30/2020");
        obj2.method();
    }

}