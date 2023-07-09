package class29;

public class BankAccount {
    double balance;
    BankAccount (double balance){
        this.balance = balance;
    }
    void withdraw (double amountToWithdraw){
        if (amountToWithdraw > balance){
         //   System.out.println("not possible, insufficient balance");
            throw new InsuficientBalance("not possible, insufficient funds");
        }
        balance = balance - amountToWithdraw;
    }


}
