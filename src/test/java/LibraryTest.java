import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void setUp(){
        book1 = new Book("Steelheart", "Brandon Sanderson", "Sci-Fi");
        book2 = new Book("Senlin Ascends", "Josiah Bancroft", "Fantasy");
        book3 = new Book("War and Peace", "Leo Tolstoy", "Literary Fiction");
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        library = new Library(books, 4);
    }

    @Test
    public void canGetNumberOfBooks(){
        assertEquals(3, library.getBookCount());
    }

    @Test
    public void canAddBook(){
        Book book4 = new Book("Made up book", "Joe Bloggs", "Non-Fiction");
        library.addBook(book4);
        assertEquals(4, library.getBookCount());
    }

    @Test

    public void wontAddBookIfFull(){
        Book book4 = new Book("Made up book", "Joe Bloggs", "Non-Fiction");
        library.addBook(book4);
        library.addBook(book4);
        assertEquals(4, library.getBookCount());
    }

}
