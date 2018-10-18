public class Lesson1 {
    public static void main(String[] args) {
/*        Задача 1:
        Задайте высоту, длину и ширину прямоугольного параллелепипеда и найти его площадь.
        Узнайте, что больше: ширина или высота и выведите информацию об этом в консоль.*/
        int h = 2;
        int l = 3;
        int w = 5;
        int s = 2 * ((h*l) + (l*w) + (h*w));
        System.out.println("Площадь параллелепипеда = " + s);

        int largePar = (h<w) ? w : h;
        System.out.println(largePar);

        if (h>w) {
            System.out.println("Высота" + h + "больше ширины" + w);
        }else {
            System.out.println("Ширина w = " + w + " больше высоты h = " + h);
        }
/*      Задача 2:
        На садовом участке площадью 10 соток , разбили грядки 15 на 25 метров.
        Сколько м2 осталось незанято?*/
        int squareGarden = 1000;
        int lengthRidge = 25;
        int widthRidge = 15;
        int squareRidge = lengthRidge * widthRidge;
        int freeSquare = squareGarden - squareRidge;
        System.out.println("Осталось не занято " + freeSquare + " m2");
    }
}
