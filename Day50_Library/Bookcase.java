package Day50_Library;

import java.util.List;

public class Bookcase {
    Shelf[] bookcase;

    public Bookcase(Shelf topShelf, Shelf middleShelf, Shelf bottomShelf) {
        this.bookcase = new Shelf[3];
        bookcase[0] = bottomShelf;
        bookcase[1] = middleShelf;
        bookcase[2] = topShelf;
    }

    public void add(Book book) {

        for (int i = 0; i < bookcase.length; i++) {
            if (bookcase[i].categoriesHolding.contains(book.getCategory())){
                bookcase[i].shelfContents.add(book);
                return;
            }
        }

    }

    public Shelf getTopShelf() {
        return bookcase[2];
    }
    public Shelf getMiddleShelf() {
        return bookcase[1];
    }public Shelf getBottomShelf() {
        return bookcase[0];
    }
}
