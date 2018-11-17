package lesson11Col.task3;

import java.util.*;

public class MyList<E> extends ArrayList<String> {
/*  Написать программу со следующим функционалом:
    Считывание  с клавиатуры 10 слов в список строк.
    Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
    Метод printList()  должен выводить результат на экран (каждое значение с новой строки).*/
    private MyList<String > list;

    @Override
    public boolean addAll(Collection<? extends String> c) {
        return super.addAll (c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        return super.addAll (index, c);
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

    public MyList() {
        super ();
    }

    public void doubleValues(){
        this.addAll (0,this);
        Collections.sort (this);
    }

    @Override
    public String toString() {
        return super.toString ();
    }

    public void printList(){
        Iterator<String > iterator = this.iterator ();
        while(iterator.hasNext ()){
            System.out.println (iterator.next ());
        }
    }
}
