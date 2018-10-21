package lesson2;

public class Lesson2 {
    public static void main(String[] args) {
/*        Задача 1*
        В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа.
        Создать программу, которая переставит числа в переменных таким образом,
        чтобы при выводе на экран последовательность a, b и c оказалась строго возрастающей.
        Числа в переменных a, b и c: 3, 9, -1
        Возрастающая последовательность: -1, 3, 9*/
        System.out.println("Задача 1");
        int a = 15;
        int b = -3;
        int c = 6;
        if (a>b & a>c & b>c) {
            System.out.println( c + "," + b + "," + a);
        } else if (b>a & b>c & a>c){
            System.out.println(c + "," + a + "," + b);
        } else if (c>a & c>b & b>a){
            System.out.println(a + "," + b + "," + c);
        } else if (a>b & a>c & c>b){
            System.out.println(b + "," + c + "," + a);
        } else if (b>a & b>c & c>a){
            System.out.println(a + "," + c + "," + b);
        } else if (c>b & c>a & a>b){
            System.out.println(b + "," + a + "," + c);
        }
/*      Задача 3*
        Создайте программу,
        выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
*/
        System.out.println("Задача 2");
        int i=2;
        for (int j = 0; j < 20; j++){
           System.out.println(i);
            i*=2;
        }
/*
        Задача 6*
        В городе N проезд в трамвае осуществляется по бумажным отрывным билетам.
        Каждую неделю трамвайное депо заказывает в местной типографии рулон билетов с номерами от 000001 до 999999.
        «Счастливым» считается билетик у которого сумма первых трёх цифр номера равна сумме последних трёх цифр,
        как, например, в билетах с номерами 003102 или 567576.
        Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета и теперь раздумывает, как много сувениров потребуется.
        С помощью программы подсчитайте сколько счастливых билетов в одном рулоне?
*/
        System.out.println("Задача 3");
        int sumLucky = 0;
        for (int d = 999999; d >= 1; d--) {
            int sumFirst = (d - (d % 1000)) / 1000;
            int sumSecond = d % 1000;
            int firstNum = (sumFirst - (sumFirst % 100)) / 100;
            int secondNum = ((sumFirst - (sumFirst % 10)) / 10) % 10;
            int thirdNum = (int) (sumFirst - (((sumFirst - (sumFirst % 10)) / 10) / 0.1));
            int fourNum = (sumSecond - (sumSecond % 100)) / 100;
            int fiveNum = ((sumSecond - (sumSecond % 10)) / 10) % 10;
            int sixNum = (int) (sumSecond - (((sumSecond - (sumSecond % 10)) / 10) / 0.1));
                if (firstNum + secondNum + thirdNum == fourNum + fiveNum + sixNum){
                    sumLucky++;
//                    System.out.println(d + "," + sumLucky);
                }
        }
        System.out.println("Количество счастливых билетов = " + sumLucky);
/*      Задача 7*
        Электронные часы показывают время в формате от 00:00 до 23:59.
        Подсчитать сколько раз за сутки случается так,
        что слева от двоеточия показывается симметричная комбинация для той,
        что справа от двоеточия (например, 02:20, 11:11 или 15:51).
*/
        System.out.println("Задача 4");
        int luckyTime = 0;
        for (int h = 0; h <= 23; h++) {
            int firstHour = (h - h % 10) / 10;
            int secHour = h % 10;
            for (int m = 0; m <= 59; m++) {
                int firstMin = (m - m % 10) / 10;
                int secMin = m % 10;
                if (firstHour == secMin & secHour == firstMin) {
                    luckyTime++;
//                    System.out.println(firstHour + " " + secHour + " : " + firstMin + " " + secMin);
                }
            }
        }
        System.out.println("Симметричная комбинация покажется за сутки = " + luckyTime + " раз");
/*      Задача 8*
        Есть три вершины X, Y, Z.
        Их координаты (x1, x2), (y1, y2), (z1, z2) заданы как целые числа.
        Нужно определить - является ли треугольник с заданными координатами прямоугольным.
*/
        System.out.println("Задача 5");
        int d = 3, d1 = 4, e = 3, e1 = 4, f = 1, f1 = 3;
        if (d == f & f1 == e1 | d == e & d1 == f1 | d == e & e1 == f1){
            System.out.println("Треугольник является прямоугольным");
//        } else if (d1 == e1 == f1 | d == e == f){
//            System.out.println("Это не треугольник, а линия");
        } else {
            System.out.println("Треугольник не является прямоугольным");
        }
/*
        Задача 9*
        Задать количество тарелок и количество моющего средства.
        Моющее средство расходуется из расчета 0,5 на одну тарелку.
        В цикле выводить сколько моющего средства осталось после мытья каждой тарелки
        В конце вывести, сколько тарелок осталось, когда моющее средство закончилось или наоборот.
*/
        System.out.println("Задача 6");
        double aosNum = 10;
        for (int plateNum = 5; plateNum >= 0 ; plateNum--) {
            if (aosNum > 0) {
                aosNum -= 0.5;
            } else if (aosNum == 0 & plateNum > 0) {
                System.out.println("Осталось не помыто тарелок = " + plateNum);
            } else if (plateNum == 0) {
            }
        }
        System.out.println("Моющего средства осталось = " + aosNum);
    }
}
