import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> bookCollection;

    public Borrower(){
        this.bookCollection = new ArrayList();
    }

    public int bookCount() {
        return this.bookCollection.size();
    }


    public void borrowBook(Library library, Book book) {
        Book bookToBorrow = library.loanBook(book);
        bookCollection.add(bookToBorrow);
    }
}
