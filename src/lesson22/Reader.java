package lesson22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Reader extends Thread {
    private String name;
    private Library library;
    private List<Book> bookList;

    public Reader(String name, Library library) {
        this.name = name;
        this.library = library;
        this.bookList = new ArrayList<> ();
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner (System.in);
        boolean choice = true;
        boolean returnBook = true;
        System.out.println ("Добрый день " + name + " !");
        System.out.println ("Книги в наличии: " + library.getBooksOnHands ()
                + " только для чтения в зале: " + library.getBooksOnRR ());
        while(choice) {
            System.out.println ("Какую книгу будете брать " + name + " ?");
            String chosenBook = scanner.nextLine ();
            for (Book book : library.booksOnHands.keySet ()) {
                if (chosenBook.equals (book.getName ())) {
                    bookList.add (book);
                    library.removeOnHands (book);
                    System.out.println ("Взяли книгу на руки " + bookList + " " + name);
                    System.out.println ("Книги в наличии: " + library.getBooksOnHands () + " только для чтения в зале: " + library.getBooksOnRR ());
                }
            }
            for (Book book : library.booksOnRR.keySet ()) {
                if (chosenBook.equals (book.getName ())) {
                    bookList.add (book);
                    library.removeOnRR (book);
                    System.out.println ("Взяли книгу в читальный зал" + bookList + " " + name);
                    System.out.println ("Книги в наличии: " + library.getBooksOnHands () + " только для чтения в зале: " + library.getBooksOnRR ());
                }
            }
            System.out.println ("Будете ли еще брать книги " + name + " ?");
            System.out.println ("Да или нет?");
            String yesOrNo = scanner.nextLine ();
            if (yesOrNo.equalsIgnoreCase ("нет")){
                choice = false;
            }
            break;
        }
        while(returnBook){
            System.out.println ("Какую книгу вы хотите вернуть " + name + " ?");
            String returnedBook = scanner.nextLine ();
            for (Book book: library.booksOnHands.keySet ()) {
                if(returnedBook.equals (book.getName ())){
                    bookList.remove (book);
                    library.addBooks (book);
                    System.out.println ("Книга возвращена в библиотеку" + "\n");
                    System.out.println ("Книги в наличии: " + library.getBooksOnHands ()
                            + " только для чтения в зале: " + library.getBooksOnRR ());
                }
            }
            for (Book book: library.booksOnRR.keySet ()) {
                if(returnedBook.equals (book.getName ())){
                    bookList.remove (book);
                    library.addBooks (book);
                    System.out.println ("Книга возвращена в библиотеку" + "\n");
                    System.out.println ("Книги в наличии: " + library.getBooksOnHands ()
                            + " только для чтения в зале: " + library.getBooksOnRR ());
                }
            }
            System.out.println ("Будете ли еще возвращать книги " + name + " ?");
            System.out.println ("Да или нет?");
            String yesOrNo = scanner.nextLine ();
            if (yesOrNo.equalsIgnoreCase ("нет")){
                choice = false;
            }
            break;
        }
        System.out.println ("Книги в наличии после закрытия: " + library.getBooksOnHands ()
                + " только для чтения в зале: " + library.getBooksOnRR ());
        System.out.println ("Книги у читателя после закрытия: " + bookList + " " + name);
    }
}
