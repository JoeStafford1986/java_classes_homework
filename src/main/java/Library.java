import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> bookCollection;
    private int capacity;
    private HashMap<String, Integer> genreSectionCounter;

    public Library(int capacity) {
        this.bookCollection = new ArrayList();
        this.capacity = capacity;
        genreSectionCounter = new HashMap<String, Integer>();
    }

    public int bookCount() {
        return this.bookCollection.size();
    }

    public void addBook(Book book) {
        if (this.bookCount() < this.capacity) {
            this.bookCollection.add(book);
        }
    }

    public boolean findBook(String bookRequest) {
        for (Book book : this.bookCollection){
            if (book.getTitle() == bookRequest){
                return true;
            }
        }
        return false;
    }

    public int getBookIndex(Book book){
        return this.bookCollection.indexOf(book);
    }

    public Book loanBook(Book book){
        return this.bookCollection.remove(this.getBookIndex(book));
    }

    public HashMap<String,Integer> getGenreSectionCounter() {
        return this.genreSectionCounter;
    }

//
//    public int findBookIndex(String bookRequest) {
//        for (Book book : this.bookCollection) {
//            if (book.getTitle() == bookRequest){
//                return this.bookCollection.indexOf(book);
//            }
//        }
//    }
}
