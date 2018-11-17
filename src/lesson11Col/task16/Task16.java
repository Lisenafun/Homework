package lesson11Col.task16;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
/*      Задача 16
        Пользователь вводит с клавиатуры 20 слов.
        Нужно подсчитать количество одинаковых слов в списке.
        Результат нужно представить в виде Map<String, Integer>,
        где первый параметр – уникальная строка, а второй – число,
        сколько раз данная строка встречалась в списке.
        Вывести результат на экран.
        Регистр влияет на результат.*/
        ArrayList<String> listWord = new ArrayList<> ();
        Scanner in = new Scanner (System.in);
        System.out.println ("Введите 20 слов:");
        for (int i = 0; i < 20; i++) {
            listWord.add (in.nextLine ());
        }
//        System.out.println (listWord);
        Map<String,Integer> baseSWord = new LinkedHashMap<> ();
        for (int i = 0; i < listWord.size (); i++) {
            for (int j = 0; j < listWord.size (); j++) {
                if (i == j | i > j) {
                    continue;
                } else {
                    if (listWord.get (i).equals (listWord.get (j)) == true) {
                        baseSWord.put (listWord.get (i), null);
                    }
                }
            }
        }
//        System.out.println (baseSWord);
        for (Map.Entry<String,Integer> e: baseSWord.entrySet ()) {
            int countWord = 0;
            for (int i = 0; i < listWord.size (); i++){
                if(e.getKey ().equals (listWord.get (i))){
                    countWord++;
                }
            }
            baseSWord.putIfAbsent (e.getKey (),countWord);
        }
        System.out.println (baseSWord);
    }
}
