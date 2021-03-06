import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> bookCollection;
    private int capacity;
    private HashMap<String, Integer> genreSectionCounter;

    public Library(int capacity) {
        this.bookCollection = new ArrayList();
        this.capacity = capacity;
        this.genreSectionCounter = new HashMap<String, Integer>();
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

    public void classifyBooks() {
        for(Book book : this.bookCollection){
            if (this.genreSectionCounter.containsKey(book.getGenre())){
                int genreCounter = this.genreSectionCounter.get(book.getGenre()) + 1;
                this.genreSectionCounter.put(book.getGenre(), genreCounter);
            }else {
                this.genreSectionCounter.put(book.getGenre(), 1);
            }
        }
    }
}
