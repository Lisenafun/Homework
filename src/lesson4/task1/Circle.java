package lesson4.task1;

public class Circle {
    private Point point1 = new Point();
    private Point point2 = new Point();
    private double square;
    private  double length;
    private double radius;
    private int b = 2;
    public void setCirc (){
        System.out.println("Круг");
        point1.setPoint();
        point2.setPoint();
    }

    public int squareC() {
        square = (Math.pow((point1.getX()-point2.getX()),b)+Math.pow((point1.getY()-point2.getY()),b)) * Math.PI;
        return (int) square;
    }
    public int lengthC() {
        length = Math.sqrt(Math.pow((point1.getX()-point2.getX()),b)+Math.pow((point1.getY()-point2.getY()),b))
                * 2 * Math.PI;
        return (int) length;
    }
    public int radC() {
        radius = Math.sqrt(Math.pow((point1.getX() - point2.getX()), b) + Math.pow((point1.getY() - point2.getY()), b));
    return (int) radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "square=" + square +
                ", length=" + length +
                '}';
    }
}
