import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    String bookRequest;

    @Before
    public void before(){
        library = new Library(10);
        book1 = new Book("LOTR");
        bookRequest = "LOTR";
    }

    @Test
    public void bookCollectionStartsEarly(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void bookCollectionFull(){
        Library smallLibrary = new Library(2);
        smallLibrary.addBook(book1);
        smallLibrary.addBook(book1);
        smallLibrary.addBook(book1);
        assertEquals(2, smallLibrary.bookCount());
    }

    @Test
    public void canFindBook(){
        library.addBook(book1);
        assertEquals(true, library.findBook("LOTR"));
    }

    @Test
    public void cannotFindBook(){
        library.addBook(book1);
        assertEquals(false, library.findBook("The Hobbit"));
    }

    @Test
    public void noBooksForFindBook(){
        assertEquals(false, library.findBook("The Hobbit"));
    }

}
