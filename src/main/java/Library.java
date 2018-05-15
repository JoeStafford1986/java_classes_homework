import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookCollection;

    public Library() {
        this.bookCollection = new ArrayList();
    }

    public int bookCount() {
        return this.bookCollection.size();
    }

    public void addBook(Book book) {
        this.bookCollection.add(book);
    }
}