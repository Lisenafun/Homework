package lesson11Col.task15;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
/*        Задача 15
        Коллекция хранит фамилии человека и город проживания.
        Считывая город с клавиатуры программа должна выводить фамилии  людей,
        живущих в данном городе.*/
        Map<String,String> baseTown = new LinkedHashMap<> ();
        baseTown.put ("Key","Miami");
        baseTown.put ("Smith","New York");
        baseTown.put ("Li","New York");
        baseTown.put ("Jonson","London");
        baseTown.put ("Bulko","Kiev");
        baseTown.put ("Vyshko","Kiev");
        baseTown.put ("Ivanov","Moscow");
        Scanner in = new Scanner (System.in);
        System.out.println ("Введите название города:");
        String nameTown = in.nextLine ();
        for (Map.Entry e: baseTown.entrySet ()) {
            if(nameTown.equals (e.getValue ())){
                System.out.println ("В городе " + nameTown + " живет " + e.getKey ());
            }
        }

    }
}
