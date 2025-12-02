class Point {
    int xCo, yCo;

    Point(int x, int y) {
        this.xCo = x;
        this.yCo = y;
    }

    double distanceBetPoints(Point p) {
        return Math.sqrt(Math.pow(this.xCo - p.xCo, 2) + Math.pow(this.yCo - p.yCo, 2));
    }
}
public class MainPoint {
    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(6, 9);

        System.out.println(p1.distanceBetPoints(p2));
    }
}


