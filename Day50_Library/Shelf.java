package Day50_Library;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
    List<Book> shelfContents;
    List<String> categoriesHolding;

    public Shelf() {
        this.shelfContents = new ArrayList<>();
        this.shelfContents = new ArrayList<>();

    }

    public Shelf(List<Book> shelfContents) {
        this.shelfContents = shelfContents;
        this.categoriesHolding = findCategories(shelfContents);
    }

    private List<String> findCategories(List<Book> shelfContents) {
        List<String> categories = new ArrayList<>();

        for (Book book:
             shelfContents) {
            if (!categories.contains(book.getCategory())) {
                categories.add(book.getCategory());
            }
        }
        return categories;
    }
}
