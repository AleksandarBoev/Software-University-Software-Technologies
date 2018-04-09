import java.util.Arrays;
import java.util.Scanner;

public class P22IntersectionOfCircles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] circle1Tokens = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] circle2Tokens = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Circle circle1 = new Circle(circle1Tokens[0], circle1Tokens[1], circle1Tokens[2]);
        Circle circle2 = new Circle(circle2Tokens[0], circle2Tokens[1], circle2Tokens[2]);

        if (Circle.intersect(circle1, circle2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        //main ends here
    }
}

class Point{
    private int x;
    private int y;

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY(){
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public Point() {

    }
}

class Circle {
    private Point point;
    private int radius;

    public Point getPoint() {
        return this.point;
    }

    public void setPoint(int x, int y) {
        this.point.setX(x);
        this.point.setY(y);
    }

    public int getRadius(){
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(){
        this.point = new Point();
        this.radius = 0;
    }

    public Circle(int x, int y, int radius){
        this.point = new Point(x, y);
        this.radius = radius;
    }

    static boolean intersect(Circle c1, Circle c2) {
        int triangleSide1 = Math.abs(c1.getPoint().getX() - c2.getPoint().getX()); // triangle with 90 degree corner angle
        int triangleSide2 = Math.abs(c1.getPoint().getY() - c2.getPoint().getY());
        double rectangleDiagonal = Math.sqrt(triangleSide1 * triangleSide1 + triangleSide2 * triangleSide2);
        int distanceBetweenCircles = c1.getRadius() + c2.getRadius();
        if (rectangleDiagonal <= distanceBetweenCircles) {
            return true;
        } else {
            return false;
        }
    }


}
