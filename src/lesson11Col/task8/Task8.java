package lesson11Col.task8;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Task8 {
    public static void main(String[] args) {
/*      Задача 8
        Создать словарь (Map<String, String>) и
        внести в него десять записей по принципу: «фамилия» - «дата рождения».
        Удалить из словаря всех людей, родившихся летом.*/
        Map<String,String> baseBirth = new HashMap<> ();
        baseBirth.put ("Ryzhkov","2010,10,03");
        baseBirth.put ("Petrov","1988,04,04");
        baseBirth.put ("Korobkova","1973,07,10");
        baseBirth.put ("Ivanov","1935,08,23");
        baseBirth.put ("Semenov","2006,02,15");
        baseBirth.put ("Tropov","2008,08,08");
        baseBirth.put ("Logov","1977,05,06");
        baseBirth.put ("Filin","2016,12,12");
        baseBirth.put ("Shwed","1988,09,28");
        baseBirth.put ("Zotova","1963,09,06");
        System.out.println (baseBirth.toString ());
        Iterator<String> iterator = baseBirth.values ().iterator ();
        while(iterator.hasNext ()){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.ENGLISH);
            LocalDate date = LocalDate.parse(iterator.next (), formatter);
            if(date.getMonth () == Month.JUNE |
               date.getMonth () == Month.JULY |
               date.getMonth () == Month.AUGUST ){
                    iterator.remove ();
                }
            }
        System.out.println (baseBirth.toString ());
    }
}

