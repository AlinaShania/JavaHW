package class21;

public class Student {
    void learn (){
        System.out.println("Learn");
    }
    void skips (){
        System.out.println("better don't skip school");
    }
    void buyBooks (){
        System.out.println("Buy books needed");
    }

}
class SyntaxStudent extends Student{
    @Override
    void learn (){
        System.out.println("Learning hard");
    }
    @Override
    void skips (){
        System.out.println("better don't skip Syntax school");
    }
    void typingInChat (){
        System.out.println("Typing constantly in Discord");
    }
}
class CollegeStudent extends Student{
    @Override
    void learn (){
        System.out.println("Learning is great");
    }
    @Override
    void skips (){
        System.out.println("Skipping many schhol days");
    }
}
class SchoolStudent extends Student{
    @Override
    void skips (){
        System.out.println("Who?");
    }
    @Override
    void buyBooks (){
        System.out.println("Buy books you love");
    }
    void fight (){
        System.out.println("fighting at school");
    }
}

class StudentTester {
    public static void main(String[] args) {
        Student [] students = { new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};

        for (Student student : students){
            student.learn();
            student.buyBooks();
            student.skips();

        }
    }
}

