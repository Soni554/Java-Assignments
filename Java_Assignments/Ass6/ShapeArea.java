import java.util.Scanner;
abstract class Shape {
    public abstract void rectangleArea(double length, double breadth);
    public abstract void squareArea(double side);
    public abstract void circleArea(double radius);
}

class Area extends Shape {
    public void rectangleArea(double length, double breadth) {
        System.out.println("Area of the Rectangle is: " + length * breadth);
    }

    public void squareArea(double side) {
        System.out.println("Area of the Square is: " + side * side);
    }

    public void circleArea(double radius) {
        System.out.println("Area of the Circle is: " + Math.PI * radius * radius);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = new Area();

        System.out.print("Enter length and breadth for the Rectangle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        shape.rectangleArea(length, breadth);

        System.out.print("\nEnter side for the Square: ");
        double side = sc.nextDouble();
        shape.squareArea(side);

        System.out.print("\nEnter radius for the Circle: ");
        double radius = sc.nextDouble();
        shape.circleArea(radius);
    }
}
