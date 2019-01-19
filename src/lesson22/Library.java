package lesson22;

import java.util.concurrent.ConcurrentHashMap;

public class Library{
    ConcurrentHashMap<Book, Boolean> booksOnHands = new ConcurrentHashMap<> ();
    ConcurrentHashMap<Book, Boolean> booksOnRR = new ConcurrentHashMap<> ();


    public Library() {
        booksOnHands = new ConcurrentHashMap<> ();
        booksOnRR = new ConcurrentHashMap<> ();
    }

    public ConcurrentHashMap<Book, Boolean> addBooks(Book book){
        if (book.isGiveOnHands ()){
            booksOnHands.putIfAbsent(book,book.isGiveOnHands ());
            return booksOnHands;
        }else{
            booksOnRR.putIfAbsent (book,book.isGiveOnHands ());
            return booksOnRR;
        }
    }
    public ConcurrentHashMap<Book,Boolean> removeOnHands(Book book){
        booksOnHands.remove(book, book.isGiveOnHands ());
        return booksOnHands;
    }
    public ConcurrentHashMap<Book,Boolean> removeOnRR(Book book){
        booksOnRR.remove(book, book.isGiveOnHands ());
        return booksOnRR;
    }

    public ConcurrentHashMap<Book, Boolean> getBooksOnHands() {
        return booksOnHands;
    }

    public ConcurrentHashMap<Book, Boolean> getBooksOnRR() {
        return booksOnRR;
    }

}
