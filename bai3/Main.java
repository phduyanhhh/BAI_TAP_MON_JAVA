import java.util.Scanner;

class Menu {
    public int select() {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("Enter Select:");
        System.out.println("1. ADD");
        System.out.println("2. REMOVE");
        System.out.println("3. PRINT");
        System.out.println("...END...");
        System.out.println("--------------------");
        int numberSelect = sc.nextInt();
        return numberSelect;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        Menu menu = new Menu();
        int numberSelect;
        
        while (true) {
            numberSelect = menu.select();
            if(numberSelect == 1) {
                System.out.println("New Book:");
                String newbook = sc.nextLine();
                library.add(newbook);
                System.out.println("----------ADD BOOK SUCCESS----------");
            } else if (numberSelect == 2) {
                library.remove();
                System.out.println("----------REMOVE BOOK SUCCESS----------");
            } else if (numberSelect == 3) {
                System.out.println("----------LIBRARY BOOK----------");
                library.print();
            } else {
                break;
            }
        }

    }
}
