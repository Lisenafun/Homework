package lesson6.linkedList;

public interface List<E> {
    void add(E obj, int index);
    void remove(int index);
    E get(int index);// - возвращает элемент по индексу
    int size(); //- возвращает размер списка
}
