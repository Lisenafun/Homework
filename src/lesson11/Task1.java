package lesson11;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
/*      Задача 1
        Написать программу со следующим функционалом:
        Считывание максимум 5 строк с клавиатуры,
        занесение строк в список,
        поиск самой короткой строки,
        вывод самой короткой строки на экран по запросу пользователя (команда в консоле /short string)
        Если одинаково коротких строк несколько, выводить каждую с новой строки.*/
        LinkedList<String> list = new LinkedList<> ();
        Scanner in = new Scanner (System.in);
        list.add (in.nextLine ());
        list.add (in.nextLine ());
        list.add (in.nextLine ());
        list.add (in.nextLine ());
        list.add (in.nextLine ());
        System.out.println (list.toString ());
        Collections.sort (list);
//        System.out.println (list.toString ());
        System.out.println ("Для вывода на экран самой короткой строки, введите команду /short string");
        for (int i = 0; i < 1; i++) {
            Scanner in1 = new Scanner (System.in);
            String shortString = in1.nextLine ();
            if (shortString.equals ("/short string")) {
                System.out.println (list.getFirst ());
                for (int j = 1; j < list.size (); j++) {
                    if (list.getFirst ().equals (list.get (j))) {
                        System.out.println (list.get (j));
                    }
                }
            } else {
                System.out.println ("Указана некорректная команда, введите еще раз.");
                i--;
            }
        }
    }
}
