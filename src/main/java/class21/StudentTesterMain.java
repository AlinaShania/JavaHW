package class21;

public class StudentTesterMain {
    public static void main(String[] args) {
        Student [] student = {new SchoolStudent(),
                new SyntaxStudent(),
                new CollegeStudent()};
        for (Student students: student){
            students.skips();
            students.learn();
            students.buyBooks();
        }
        Student syntax = new SyntaxStudent();
       //SyntaxStudent s = (SyntaxStudent) syntax;
      // s.typingInChat();
        ((SyntaxStudent)syntax).typingInChat();

        Student school = new SchoolStudent();
        SchoolStudent sch = (SchoolStudent) school;
        sch.fight();

       if (syntax instanceof SyntaxStudent){
           ((SyntaxStudent) syntax).typingInChat();
       }else {
           System.out.println("Wrong type of object is present in syntax");
       }
    }
}
