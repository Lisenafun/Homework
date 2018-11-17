package lesson11Col.task7;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task7 {
    public static void main(String[] args) {
    /*    Задача 7
    Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
    Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
    Результат вывести на экран*/
        Map<String, String> dosie = new LinkedHashMap<> ();
        dosie.put ("Ryzhkov","Andrey");
        dosie.put ("Petrov","Stepan");
        dosie.put ("Korobkova","Svetlana");
        dosie.put ("Ivanov","Ivan");
        dosie.put ("Semenov","Petr");
        dosie.put ("Tropov","Stepan");
        dosie.put ("Petrov","Denis");
        dosie.put ("Semenov","Andrey");
        dosie.put ("Ivanov","Petr");
        dosie.put ("Zotova","Svetlana");
        int sameSur = 0;
        int sameName = 0;
        String surname = "Petrov";
        String name = "Ivan";
        for (Map.Entry<String, String> entry: dosie.entrySet ()) {
            if (surname.compareTo (entry.getKey ()) == 0) {
                sameSur++;
            } else {
                continue;
            }
        }
        for (Map.Entry<String, String> entry: dosie.entrySet ()) {
            if (name.compareTo (entry.getValue ()) == 0) {
                sameName++;
            } else {
                continue;
            }
        }
        System.out.println (sameSur);
        System.out.println (sameName);
    }
}
