
public class Rectangle {
    float width;
    float height;
    void perimeter() {
        float perimeter = (width + height) * 2;
        System.out.println("Perimeter: " + perimeter);
    }
    void area() {
        float area = width * height;
        System.out.println("Area: " + area);
    }
}
