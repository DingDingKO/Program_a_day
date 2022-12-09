package Day50_Library;

public class ShelfMaker {
    public Shelf makeShelf() {
        BookPublisher bookPublisher = new BookPublisher();
        return new Shelf(bookPublisher.makeBooks());

    }
}
