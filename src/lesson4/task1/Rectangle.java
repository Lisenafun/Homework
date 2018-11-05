package lesson4.task1;

public class Rectangle {
    private Point point1 = new Point();
    private Point point2 = new Point();
    private Point point3 = new Point();
    private Point point4 = new Point();
    private int square;
    private double perimetr;
    private int b = 2;
    public void setRec (){
        System.out.println("Прямоугольник");
        point1.setPoint();
        point2.setPoint();
        point3.setPoint();
        point4.setPoint();
    }
    public int squareR() {
        square = Math.abs(point1.getX()*point2.getY()-point2.getX()*point1.getY()
                + point2.getX()*point3.getY()-point3.getX()*point2.getY()
                + point4.getX()*point1.getY()-point1.getX()*point4.getY()
                + point3.getX()*point4.getY()-point4.getX()*point3.getY())/2;
        return square;
    }
    public int perimetrR(){
        perimetr = Math.sqrt(Math.pow(point2.getX()-point1.getX(),b)+Math.pow(point2.getY()-point1.getY(),b))
                +Math.sqrt(Math.pow(point3.getX()-point2.getX(),b)+Math.pow(point3.getY()-point2.getY(),b))
                +Math.sqrt(Math.pow(point4.getX()-point3.getX(),b)+Math.pow(point4.getY()-point3.getY(),b))
                +Math.sqrt(Math.pow(point4.getX()-point1.getX(),b)+Math.pow(point4.getY()-point1.getY(),b));
        return (int) perimetr;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "square=" + square +
                ", perimetr=" + perimetr +
                '}';
    }
}
