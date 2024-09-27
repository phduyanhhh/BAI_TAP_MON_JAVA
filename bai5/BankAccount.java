
import java.util.Arrays;

public class BankAccount {
    String name = "Phan Duy Anh";
    int balance = 1000000;
    void deposit(int money) {
        balance = balance + money;
    }
    void withdraw(int money) {
        balance = balance - money;
    }
    void print() {
        System.out.println("Bank Account Name: " + name);
        System.out.println("Money: " + balance);
    }
}
    
