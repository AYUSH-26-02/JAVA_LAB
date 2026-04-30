import java.util.Scanner;

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Circle {
    Point center;
    double radius;

    Circle(Point p, double r) {
        center = p;
        radius = r;
    }

    void display() {
        double area = Math.PI * radius * radius;
        System.out.println("Center: (" + center.x + ", " + center.y + ")");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        Point p = new Point(x, y);
        Circle c = new Circle(p, r);

        c.display();
        sc.close();
    }
}
