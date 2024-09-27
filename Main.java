import bai1.Person;
import bai2.Rectangle;

public class Main {
    public static void main(String[] args) {
        System.out.println("----PERSON----");
        Person person = new Person();
        person.name = "Duy Anh";
        person.age = 19;
        person.print();
        System.out.println("----AREA and PERIMETER----");
        Rectangle rectangle = new Rectangle();
        rectangle.width = 15.6f;
        rectangle.height = 6.8f;
        rectangle.perimeter();
        rectangle.area();
        System.out.println("----LIBRARY----");
    }
}
