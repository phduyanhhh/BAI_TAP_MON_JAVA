import java.util.Scanner;

class Menu {
    public int select() {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("Enter Select:");
        System.out.println("1. ADD MAJOR");
        System.out.println("2. REMOVE MARJOR");
        System.out.println("3. PRINT MAJOR");
        System.out.println("...END...");
        System.out.println("--------------------");
        int numberSelect = sc.nextInt();
        return numberSelect;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student studentMajor = new Student();
        Menu menu = new Menu();
        int numberSelect;
        
        while (true) {
            numberSelect = menu.select();
            if(numberSelect == 1) {
                System.out.println("New Major:");
                String newMajor = sc.nextLine();
                studentMajor.add(newMajor);
                System.out.println("----------ADD MAJOR SUCCESS----------");
            } else if (numberSelect == 2) {
                studentMajor.remove();
                System.out.println("----------REMOVE MAJOR SUCCESS----------");
            } else if (numberSelect == 3) {
                System.out.println("----------INFORMATION STUDENT----------");
                studentMajor.print();
            } else {
                break;
            }
        }

    }
}
