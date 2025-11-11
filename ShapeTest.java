import java.util.Scanner;

// Base class
class Shape {
    void draw() {
        System.out.println("Drawing a shape...");
    }

    double calculateArea() {
        System.out.println("Calculating area of shape...");
        return 0;
    }
}

// Subclass Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Circle...");
    }

    @Override
    double calculateArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}

// Subclass Cylinder
class Cylinder extends Shape {
    double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Cylinder...");
    }

    @Override
    double calculateArea() {
        // Total Surface Area = 2πr(h + r)
        double area = 2 * Math.PI * radius * (height + radius);
        return area;
    }
}

// Main class
public class ShapeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Circle
        System.out.print("Enter radius of Circle: ");
        double r1 = sc.nextDouble();
        Shape circle = new Circle(r1);
        circle.draw();
        System.out.println("Area of Circle: " + circle.calculateArea());

        System.out.println("-----------------------------");

        // Cylinder
        System.out.print("Enter radius of Cylinder: ");
        double r2 = sc.nextDouble();
        System.out.print("Enter height of Cylinder: ");
        double h = sc.nextDouble();
        Shape cylinder = new Cylinder(r2, h);
        cylinder.draw();
        System.out.println("Total Surface Area of Cylinder: " + cylinder.calculateArea());

        sc.close();
    }
}
