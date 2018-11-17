package lesson11Col.task14;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
/*        Задача 14
        Написать программу, которая считывает с клавиатуры имя месяца
        и выводит его номер на экран в виде: «Май 5 месяц».
        Использовать коллекции.*/
        Map<String,String> monthSet = new LinkedHashMap<> ();
        monthSet.put ("январь","1 месяц");
        monthSet.put ("февраль","2 месяц");
        monthSet.put ("март","3 месяц");
        monthSet.put ("апрель","4 месяц");
        monthSet.put ("май","5 месяц");
        monthSet.put ("июнь","6 месяц");
        monthSet.put ("июль","7 месяц");
        monthSet.put ("август","8 месяц");
        monthSet.put ("сентябрь","9 месяц");
        monthSet.put ("октябрь","10 месяц");
        monthSet.put ("ноябрь","11 месяц");
        monthSet.put ("декабрь","12 месяц");
        Scanner in = new Scanner (System.in);
        System.out.println ("Введите название месяца:");
        String nameMonth = in.nextLine ();
        System.out.println (nameMonth + " " + monthSet.get (nameMonth));
    }
}
