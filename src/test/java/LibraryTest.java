import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library(10);
    }

    @Test
    public void bookCollectionStartsEarly(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void bookCollectionFull(){
        Library smallLibrary = new Library(2);
        smallLibrary.addBook(book);
        smallLibrary.addBook(book);
        smallLibrary.addBook(book);
        assertEquals(2, smallLibrary.bookCount());
    }
}
