package lesson3;

import jdk.nashorn.internal.runtime.regexp.joni.Matcher;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Lesson3 {
    public static void main(String[] args) {
/*
   Задача 1
   Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
   отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
   Перед созданием массива подумайте, какого он будет размера. 2 4 6 … 18 20 2 4 6 … 20
*//*
        System.out.println("Задача 1");
        int [] arr = new int[10];
        for (int i = 2, b = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                arr[b] = i;
                System.out.print(arr[b] + " ");
                b++;
            }
        }
        System.out.println(" ");
        int [] arr1 = new int[10];
        for (int i = 2, b = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                arr1[b] = i;
                System.out.println(arr1[b] + " ");
                b++;
            }
        }
*//*        Задача 2
        Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
        а затем этот же массив выведите на экран тоже в строку,
        но в обратном порядке (99 97 95 93 … 7 5 3 1).*//*
//        int a=0;
//        for(int i=1;i<=99;i++){
//            System.out.println(a);
//            if(i%2!=0)a++;
//        }
        System.out.println("Задача 2");
        int[] arr2 = new int[50];
        for(int i=1,b=0;i<=99;i++){
            if(i%2!=0){
                arr2[b]=i;
                System.out.print(arr2[b] + " ");
                b++;
            }
        }
        System.out.println(" ");
        for(int i=arr2.length-1;i>=0;i--){
            System.out.print(arr2[i] + " ");
        }
        System.out.println(" ");
*//*        Задача 4*
    Пользователь должен указать с клавиатуры чётное положительное число,
    а программа должна создать массив указанного размера из случайных целых чисел из [-5;5]
    и вывести его на экран в строку. После этого программа должна определить
    и сообщить пользователю о том, сумма модулей какой половины массива больше:
    левой или правой, либо сообщить, что эти суммы модулей равны.
    Если пользователь введёт неподходящее число, то программа должна требовать
    повторного ввода до тех пор, пока не будет указано корректное значение.*//*
        int [] arr4;
        for (int i = 0; i < 1 ; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите любое целое положительное число ");
            int num = scanner.nextInt();
            if (num < 0 | num % 2 != 0) {
                System.out.println("Неверный ввод.");
                i--;
            } else if (num > 0 & num % 2 == 0) {
                arr4 = new int [num];
                int[] arr67 = new int[11];
                for (int j = 0; j < arr67.length; j++) {
                    arr67[j] = -5+j;
                    int x;
                    for (int k = 0; k < arr4.length ; k++) {
                        x = (int) (Math.random() * 11);
                        arr4[k] = arr67[x];
                    }
                }
                System.out.println(Arrays.toString(arr4));
                int num2 = num / 2;
                int [] arr5 = new int[num2];
                int [] arr6 = new int[num2];
                System.arraycopy(arr4,0, arr5,0,num2);
                System.arraycopy(arr4, num2, arr6,0,num2);
                System.out.println(Arrays.toString(arr5) + Arrays.toString(arr6));
                int sum1 = 0;
                int sum2 = 0;
                for (int j = 0; j < num2; j++) {
                sum1 += Math.abs(arr5[j]);
                sum2 += Math.abs(arr6[j]);
            }
            if (sum1 > sum2){
                System.out.println("Сумма модулей первой половины массива больше второй");
            } else if(sum2 > sum1){
                System.out.println("Сумма модулей второй половины массива больше первой");
            }else{
                System.out.println("Сумма модулей первой и второй половины массива равны");
            }
            }
        }*/

/*        Строки
        1) Найти в строке указанную подстроку и заменить ее на новую.
        Строку, ее подстроку для замены и новую подстроку вводит пользователь.*/
        Scanner inString = new Scanner(System.in);
        System.out.print("Введите строку в поле:");
        String string1 = inString.nextLine();
        System.out.print("Введите часть строки, которую необходимо заменить:");
        String delString = inString.nextLine();
        System.out.print("Введите выражение, которое необходимо вставить:");
        String copyString = inString.nextLine();
        String stringNew = string1.replaceAll(delString,copyString);
        System.out.println("Итого:" + stringNew);
        stringNew.replaceAll("[^a-z]+","*");
        System.out.println("Убираем повторяющиеся символы:" + stringNew);
        System.out.println("Убираем пробелы:" + stringNew.replaceAll("\\s", ""));



    }
}


