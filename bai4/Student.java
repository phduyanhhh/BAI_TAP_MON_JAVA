
import java.util.Arrays;

public class Student {
    String name = "Phan Duy Anh";
    String classStudent = "DCCTCLC67A";
    String[] major = {"CNTT"};
    void add(String newMajor) {
        major = Arrays.copyOf(major, major.length+1);
        major[major.length - 1] = newMajor;
    }
    void remove() {
        major = Arrays.copyOf(major, major.length-1);
    }
    void print() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Class: " + classStudent);
        for(int i = 0; i < major.length; i++) {
            System.out.println(major[i]);
        }
    }
    
}
