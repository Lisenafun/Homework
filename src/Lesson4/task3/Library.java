package Lesson4.task3;

import java.util.Arrays;

public class Library {
    private Book book;
    private Book [] library = new Book[10];
    private static int size = 10;

    public int getSize() {
        return size;
    }

    public void put(Book book, int quantity){
        if(size==0){
            System.out.println("Места для книг нет");
            return;
        }
        for (int i = 0; i < quantity; i++) {
            if (library[i] == null) {
                library[i] = book;
                size--;
                if(size==0){
                    int lost = quantity-library.length;
                    System.out.println("Места для оставшихся " + lost + " книг нет");
                    return;
                }
            }else if (library[i] != null) {
                quantity++;
            }
        }
    }

    public int get(Book book,int quantity){
        for (int i = 0; i < quantity; i++) {
            if(library[i] == book){
                library[i] = null;
                size++;
            }else if(library[i] != book){
                quantity++;
                }
            if(i>library.length){
                System.out.println ("Указанных книг больше в библиотеке нет");
            }
        }
        return size;
    }

    @Override
    public String toString() {
        return "Library{" + Arrays.toString(library) +
                '}';
    }
}
