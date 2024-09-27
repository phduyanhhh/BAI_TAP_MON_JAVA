
import java.util.Arrays;
import java.util.Scanner;

public class Library {
    String[] library = {"Toi thay..."};

    void add(String newBook) {
        library = Arrays.copyOf(library, library.length+1);
        library[library.length - 1] = newBook;
    }
    void remove() {
        library = Arrays.copyOf(library, library.length-1);
    }
    void print() {
        for(int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }
    }
}
