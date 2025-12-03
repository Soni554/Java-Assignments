import java.util.Scanner;
class Area {
    private double length, breath;

    public void setDim(double length, double breath) {
        validate(length, "Length");
        validate(breath, "Breath");
        this.length = length;
        this.breath = breath;
    }

    public double getArea() {
        return length * breath;
    }

    private static void validate(double value, String name) {
        if (value <= 0) {
            System.out.println(name + " can only be positive");
            System.exit(0);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area area = new Area();
        System.out.print("Enter the length and breath of the rectangle: ");
        double length = sc.nextDouble();
        double breath = sc.nextDouble();
        area.setDim(length, breath);
        System.out.println("The area of the rectangle is " + area.getArea());
    }
}
