package lesson11Col.task9;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
/*      Задача 9
        Создать Map<String, Integer> и
        внести в него десять записей по принципу: «фамилия» - «зарплата».
        Удалить всех людей, у которых зарплата ниже введенного с клавиатуры числа*/
        Map<String, Integer> baseSalary = new LinkedHashMap<> ();
        baseSalary.put ("Ryzhkov",15000);
        baseSalary.put ("Petrov",45000);
        baseSalary.put ("Korobkova",35300);
        baseSalary.put ("Ivanov",25700);
        baseSalary.put ("Semenov",10300);
        baseSalary.put ("Tropov",5000);
        baseSalary.put ("Logov",115000);
        baseSalary.put ("Filin",75000);
        baseSalary.put ("Shwed",25040);
        baseSalary.put ("Zotova",195000);
        Scanner in = new Scanner (System.in);
        System.out.println ("Введите уровень минимальной зарплаты");
        int minSalary = in.nextInt ();
        Iterator<Integer> iterator = baseSalary.values ().iterator ();
        while(iterator.hasNext ()){
            if(iterator.next ()<minSalary){
                iterator.remove ();
            }
        }
        System.out.println (baseSalary.toString ());
    }
}
