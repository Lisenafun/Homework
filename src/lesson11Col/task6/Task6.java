package lesson11Col.task6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
/*      Задача 6
        Написать программу, которая должна:
        Считывать с клавиатуры 2 числа N и M.
        Ввести N строк и заполнить ими список.
        Переставить M первых строк в конец списка.
        Вывести список на экран, каждое значение с новой строки.*/
        Scanner in = new Scanner (System.in);
        LinkedList<String> list = new LinkedList<> ();
        int N = in.nextInt ();
        int M = in.nextInt ();
        System.out.println ("Введите строки");
        Scanner in1 = new Scanner (System.in);
        for (int i = 0; i < N; i++) {
            list.add (in1.nextLine ());
        }
        for (int i = 0; i < M; i++) {
            list.addLast(list.getFirst ());
            list.removeFirstOccurrence (list.getFirst ());
        }
        System.out.println ("Упорядоченный лист");
        for (String e: list) {
            System.out.println (e);
        }
    }
}
