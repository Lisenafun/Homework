package lesson11Col.task12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
/*      Задача 12
        Ввести с клавиатуры число N.
        Считать N целых чисел и заполнить ими список.
        Найти минимальное число среди элементов списка.*/
        System.out.println ("Введите число N:");
        Scanner in = new Scanner (System.in);
        int N = in.nextInt ();
        ArrayList<Integer> listInt = new ArrayList<> ();
        System.out.println ("Заполните список:");
        Scanner in1 = new Scanner (System.in);
        for (int i = 0; i < Math.abs (N); i++) {
            listInt.add (in1.nextInt ());
        }
        System.out.println (listInt);
        Collections.sort (listInt);
        System.out.println ("Минимальное число в списке " + listInt.get (0));
    }
}
