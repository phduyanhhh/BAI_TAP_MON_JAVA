import java.util.Scanner;

class Menu {
    public int select() {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("Enter Select:");
        System.out.println("1. DEPOSIT MONEY");
        System.out.println("2. WITHDRAW MONEY");
        System.out.println("3. PRINT BANK ACCOUNT");
        System.out.println("...END...");
        System.out.println("--------------------");
        int numberSelect = sc.nextInt();
        return numberSelect;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount bank = new BankAccount();
        Menu menu = new Menu();
        int numberSelect;
        
        while (true) {
            numberSelect = menu.select();
            if(numberSelect == 1) {
                System.out.println("Money:");
                int money = sc.nextInt();
                bank.deposit(money);
                System.out.println("----------DEPOSIT MONEY SUCCESS----------");
            } else if (numberSelect == 2) {
                System.out.println("Money:");
                int money = sc.nextInt();
                bank.withdraw(money);
                System.out.println("----------WITHDRAW MONEY SUCCESS----------");
            } else if (numberSelect == 3) {
                System.out.println("----------INFORMATION BANK ACCOUNT----------");
                bank.print();
            } else {
                break;
            }
        }

    }
}
