package Day50_Library;

import java.util.ArrayList;
import java.util.List;

public class BookPublisher {
    public List<Book> makeBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("How to eat", "bob", "cooking"));
        books.add(new Book("How to sleep", "dave", "sleep"));
        books.add(new Book("Why do we sleep", "gary", "sleep"));
        books.add(new Book("Who is Barry", "mary", "barry"));
        books.add(new Book("hello I am barry", "barry", "barry"));
        books.add(new Book("How to barry", "alice", "cooking"));
        books.add(new Book("Eggs", "dave", "cooking"));

        return books;
    }
}
