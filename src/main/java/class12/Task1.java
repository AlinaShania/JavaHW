package class12;

public class Task1 {
    public static void main(String[] args) {

        String username = "alinashania";
        String password = "NjNi987";
        String confirmYourPassword = "NjNi987";

        if (username.isBlank() && password.isBlank()){
            System.out.println("Username or Password cannot be empty");
        } else if (password.length()<8){
            System.out.println("Password is too short");
        }else if (password.contains(username)){
            System.out.println("Password cannot contain username");
        }else if (!password.equals(confirmYourPassword)){
            System.out.println("Passwords do not match");
        } else {
            System.out.println("Your username and password has been created");
        }

    }
}
