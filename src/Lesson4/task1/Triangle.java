package Lesson4.task1;

import java.util.Scanner;

public class Triangle {
    private Point point1 = new Point();
    private Point point2 = new Point();
    private Point point3 = new Point();
    public int square;
    public void setTriangle (){
            point1.setPoint();
            point2.setPoint();
            point3.setPoint();
    }
    public int squareT() {
        square = Math.abs(point1.getX()*point2.getY()-point2.getX()*point1.getY()
                + point2.getX()*point3.getY()-point3.getX()*point2.getY()
                + point3.getX()*point1.getY()-point1.getX()*point3.getY())/2;
        return square;
    }
}

