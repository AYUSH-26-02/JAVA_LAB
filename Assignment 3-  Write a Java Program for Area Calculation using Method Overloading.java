class AreaCalculator {

    // Area of square
    double area(double side) {
        return side * side;
    }

    // Area of rectangle
    double area(double length, double breadth) {
        return length * breadth;
    }

    // Area of circle
    double area(float radius) {
        return 3.14 * radius * radius;
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        AreaCalculator obj = new AreaCalculator();

        System.out.println("Area of square: " + obj.area(5));
        System.out.println("Area of rectangle: " + obj.area(4, 6));
        System.out.println("Area of circle: " + obj.area(3.0f));
    }
}
