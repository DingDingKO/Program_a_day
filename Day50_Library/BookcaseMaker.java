package Day50_Library;

public class BookcaseMaker {
    public Bookcase makeBookcase() {
        ShelfMaker shelfMaker = new ShelfMaker();
        Bookcase bookcase = new Bookcase(shelfMaker.makeShelf(), new Shelf(),new Shelf());
        return bookcase;
    }

}
