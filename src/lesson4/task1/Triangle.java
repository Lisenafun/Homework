package lesson4.task1;

public class Triangle {
    private Point point1 = new Point();
    private Point point2 = new Point();
    private Point point3 = new Point();
    private int square;
    private double perimetr;
    private int b = 2;
    public void setTriangle (){
        System.out.println("Треугольник");
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
    public int perimetrT(){
        perimetr = Math.sqrt(Math.pow(point2.getX()-point1.getX(),b)+Math.pow(point2.getY()-point1.getY(),b))
                +Math.sqrt(Math.pow(point3.getX()-point2.getX(),b)+Math.pow(point3.getY()-point2.getY(),b))
                +Math.sqrt(Math.pow(point3.getX()-point1.getX(),b)+Math.pow(point3.getY()-point1.getY(),b));
        return (int) perimetr;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "square=" + square +
                ", perimetr=" + perimetr +
                '}';
    }
}

