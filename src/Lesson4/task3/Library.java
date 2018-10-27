package Lesson4.task3;

import java.util.Arrays;

public class Library {
    private Book book;
    private Book [] library = new Book[10];

    public void put(Book book,int quantity){
        for (int i = 0; i < this.library.length; i+=quantity) {
            if (library[i] == null) {
                library[i] = book;
            }
            System.out.println("Книга" + book + "поставлена на полку");
        }
        System.out.println("Места для книги нет");
    }

    @Override
    public String toString() {
        return "Library{" +
                "book=" + book +
                ", library=" + Arrays.toString(library) +
                '}';
    }
}
