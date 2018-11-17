package lesson11Col.task5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class MyList<E> extends ArrayList<String> implements Comparable<String>{
/*  Написать программу, которая должна:
    Считывать с клавиатуры 10 слов в список строк.
    Определять, является ли список упорядоченным по возрастанию длины строки.
    В случае отрицательного ответа выводить на экран номер первого элемента,
    нарушающего такую упорядоченность.*/
    MyList<String> list;
    private String element;

    public MyList() {
        super ();
    }

    @Override
    public int size() {
        return super.size ();
    }

    @Override
    public String get(int index) {
        return super.get (index);
    }

    @Override
    public boolean add(String s) {
        return super.add (s);
    }

    @Override
    public void add(int index, String element) {
        super.add (index, element);
    }

    @Override
    public Iterator<String> iterator() {
        return super.iterator ();
    }

    @Override
    public void sort(Comparator<? super String> c) {
        super.sort (c);
    }

    @Override
    public String toString() {
        return super.toString ();
    }

    public String isSorted(){
        for (int i = 0; i < this.size()-1; i++) {
            if(this.get(i).compareTo (this.get(i+1))<0 |
               this.get(i).compareTo (this.get(i+1))==0){

            }else{
                return this.get(i+1) + " isn't sort";
            }
        }
        return "List is sorted";
    }

    @Override
    public int compareTo(String o) {
        return element.length () - o.length ();
    }
}
