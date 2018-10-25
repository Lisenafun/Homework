package Lesson4.task1;

public class Main {
    public static void main(String[] args) {
        int TS;
        Triangle triangle = new Triangle();
        Point point = new Point();
//        point.setPoint();
//        System.out.println(point.toString());
        triangle.setTriangle();
//        TS=triangle.squareT();
        System.out.println("Площадь треугольника ="+triangle.squareT());
    }
}
