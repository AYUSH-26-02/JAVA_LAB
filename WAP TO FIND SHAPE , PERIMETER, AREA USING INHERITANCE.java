class Shape {
    void area() {
        System.out.println("Area not defined for generic shape.");
    }
}
class Square extends Shape {
    int side;

    Square(int s) {
        side = s;
    }

    void area() {
        System.out.println("Area of Square: " + (side * side));
    }
}

class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }


    void area() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}
public class Main {
    public static void main(String[] args) {
        Shape s1 = new Square(5);
        Shape s2 = new Rectangle(4, 6);
        Shape s3 = new Circle(3);

        s1.area();
        s2.area();
        s3.area();
    }
}
