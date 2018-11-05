package lesson4.task1;

import java.util.Scanner;

public class Point {
    private int x;
    private int y;

    public Point() {
    }
    public void setPoint(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты вершины");
        System.out.println("x = ");
        x = scanner.nextInt();
        System.out.println("y = ");
        y = scanner.nextInt();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
