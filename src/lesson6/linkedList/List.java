package lesson6.linkedList;

public interface List {
    void add(Object obj, int index);
    void remove(int index);
    Object get(int index);// - возвращает элемент по индексу
    int size(); //- возвращает размер списка
}
