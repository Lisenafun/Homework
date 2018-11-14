package lesson11Col;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
/*      Задача 2
        Написать программу со следующим функционалом:
        Считывание 20 чисел с клавиатуры,
                сохранение их в список,
                сортировка по трём другим спискам:
        число нацело делится на 3,
                нацело делится на 2 и
        все остальные.
        Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
            Метод printList() должен выводить на экран все элементы всех списков с новой строки.
            Метод printList(String listName) должен выводить на экран все элементы указанного списка*/
        Scanner in = new Scanner (System.in);
        ArrayList<Integer> list = new ArrayList<> ();
        for (int i = 0; i < 6; i++) {
            list.add (in.nextInt ());
        }
        System.out.println (list.toString ());
        ArrayList<Integer> threeList = new ArrayList<> ();
        ArrayList<Integer> twoList = new ArrayList<> ();
        ArrayList<Integer> lostList = new ArrayList<> ();
        for (int i = 0; i < list.size (); i++) {
            if(list.get (i)%3 == 0){
                threeList.add (list.get (i));
            }
            if(list.get (i)%2 == 0){
                twoList.add (list.get (i));
            }
            if(list.get (i)%2 != 0 & list.get (i)%3 != 0) {
                lostList.add (list.get (i));
            }
        }
        System.out.println (threeList.toString ());
        System.out.println (twoList.toString ());
        System.out.println (lostList.toString ());

    }
}
