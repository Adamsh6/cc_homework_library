import java.util.ArrayList;

public class Library {

    ArrayList<Book> books;
    int capacity;

    public Library(ArrayList<Book> books, int capacity) {
        this.books = books;
        this.capacity = capacity;
    }

    public int getBookCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if(getBookCount() < capacity) {
            this.books.add(book);
        }
    }


}

