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
//        int sumFirst = (a - (a % 1000)) / 1000;
//        int sumSecond = a % 1000;
//        int firstNum = (sumFirst - (sumFirst % 100)) / 100;
//        int secondNum = ((sumFirst - (sumFirst % 10)) / 10) % 10;
//        int thirdNum = (int) (sumFirst - (((sumFirst - (sumFirst % 10)) / 10) / 0.1));
//        int fourNum = (sumSecond - (sumSecond % 100)) / 100;
//        int fiveNum = ((sumSecond - (sumSecond % 10)) / 10) % 10;
//        int sixNum = (int) (sumSecond - (((sumSecond - (sumSecond % 10)) / 10) / 0.1));

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
        System.out.println("Сумма счастливых билетов равна = " + sumLucky);
    }
}
