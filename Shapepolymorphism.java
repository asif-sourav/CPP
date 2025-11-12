// Base class
class Shape {
    void show() {
        System.out.println("This is a generic shape.");
    }

    void getInfo() {
        System.out.println("This method belongs to class: Shape");
    }
}

// Derived class Circle
class Circle extends Shape {
    @Override
    void show() {
        System.out.println("This is a Circle shape.");
    }
}

// Derived class Rectangle
class Rectangle extends Shape {
    @Override
    void show() {
        System.out.println("This is a Rectangle shape.");
    }
}

// Main class
public class Shapepolymorphism {
    public static void main(String[] args) {
        // Base class reference, but child class objects
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        System.out.println("=== Using Circle Object ===");
        s1.show();       // Overridden method → runtime polymorphism
        s1.getInfo();    // Inherited method (not overridden)

        System.out.println("\n=== Using Rectangle Object ===");
        s2.show();       // Overridden method → runtime polymorphism
        s2.getInfo();    // Inherited method (not overridden)
    }
}
