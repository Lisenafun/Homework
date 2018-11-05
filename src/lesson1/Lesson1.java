package lesson1;

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
        //верное решение
        int freeSquare2 = squareGarden % (lengthRidge*widthRidge);
        System.out.println("Осталось не занято " + freeSquare2);
/*      Задача 3:
        Найдите площадь овального кольца,
        полученного из овала площадью 15 дм2 вырезанием овала площадью 600 см2.*/
        int oval1 = 15;
        int oval2 = 6;
        int ringOval = oval1 - oval2;
        System.out.println(ringOval);
/*
        Задача 4:
        Вывести в консоль ближайшее к 10 из двух чисел, записанных в переменные m и n.
        Например, среди чисел 8.5 и 11.45 ближайшее к десяти 11.45.
        Метод Math.abs(n) возвращает абсолютное значение числа (модуль числа).
*/
        double a = -2.5;
        double b = 23.45;
        int c = 15;

        double nearestNum = ((Math.abs(c-a)) < (Math.abs(c-b))) ? a : b;
        System.out.println(nearestNum);

/*      Задача 5:
        Задать размер ипотечного кредита , процентную ставку , кол-во лет .
        Найти переплату по кредиту, значение переплаты вывести в консоль.
*/
        int credit = 1000000;
        int stavka = 9;
        int year = 3;
        int pereplata = (credit*9/100)*3;
        System.out.println("Переплата по кредиту составит " + pereplata);

/*        Задача 7:
        Создать программу, выводящую в консоль наибольшую цифру любого трехзначного натурального числа. Примеры работы программы:
        В числе 208 наибольшая цифра 8
        В числе 774 наибольшая цифра 7
        В числе 613 наибольшая цифра 6*/
    }
}
