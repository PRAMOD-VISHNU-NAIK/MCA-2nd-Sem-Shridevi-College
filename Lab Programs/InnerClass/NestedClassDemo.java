
//Interface to calculate area of a rectangle
interface Rectangle {
    void areaOfRectangle(double length, double width);
}

// Interface to calculate area of a triangle
interface Triangle {
    void areaOfTriangle(double base, double height);
}

// Class implementing both interfaces
class Shape implements Rectangle, Triangle {

    // Implementation of Rectangle's area calculation
    @Override
    public void areaOfRectangle(double length, double width) {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }

    // Implementation of Triangle's area calculation
    @Override
    public void areaOfTriangle(double base, double height) {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {
        // Create object of Shape class
        Shape shape = new Shape();

        // Calculate and print area of rectangle
        shape.areaOfRectangle(5.0, 3.0);

        // Calculate and print area of triangle
        shape.areaOfTriangle(4.0, 6.0);

    }
}
