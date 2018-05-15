import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(10);
        book = new Book("LOTR");
    }

    @Test
    public void bookCollectionStartsEmpty(){
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void canBorrowBook(){
        library.addBook(book);
        borrower.borrowBook(library, book);
        assertEquals(1, borrower.bookCount());
    }

}
