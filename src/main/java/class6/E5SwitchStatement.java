package class6;

import java.sql.SQLOutput;

public class E5SwitchStatement {
    public static void main(String[] args) {

        char gender='F';

        switch (gender){
            case 'F':
                System.out.println("Female");
                break;
            case 'M':
                System.out.println("Male");
                break;
            case'0':
                System.out.println("Others");
                break;
            default:
                System.out.println("Char not supported");
        }
    }
}
