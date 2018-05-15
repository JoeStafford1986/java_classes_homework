import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    String bookRequest;

    @Before
    public void before(){
        library = new Library(10);
        book = new Book("LOTR", "Fantasy");
        bookRequest = "LOTR";
    }

    @Test
    public void bookCollectionStartsEmpty(){
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

    @Test
    public void canFindBook(){
        library.addBook(book);
        assertEquals(true, library.findBook("LOTR"));
    }

    @Test
    public void cannotFindBook(){
        library.addBook(book);
        assertEquals(false, library.findBook("The Hobbit"));
    }

    @Test
    public void noBooksForFindBook(){
        assertEquals(false, library.findBook("The Hobbit"));
    }

    @Test
    public void canGetBookIndex(){
        library.addBook(book);
        assertEquals(0, library.getBookIndex(book));
    }

    @Test
    public void canLoanBook(){
        library.addBook(book);
        assertEquals(book, library.loanBook(book));
        assertEquals(0, library.bookCount());
    }

    @Test
    public void genreSectionCounterStartsEmpty(){
        assertEquals(0, library.getGenreSectionCounter().size());
    }

    @Test
    public void canClassifyBooks(){
        library.addBook(book);
        library.classifyBooks();
        assertEquals(1, library.getGenreSectionCounter().size());
    }

    @Test
    public void canClassifyMultipleBooksToSameGenre(){
        library.addBook(book);
        library.addBook(book);
        library.classifyBooks();
        assertEquals(1, library.getGenreSectionCounter().size());
    }

    @Test
    public void canClassifyMultipleGenres(){
        Book book1 = new Book("Italian Cookery", "Recipe Book");
        library.addBook(book);
        library.addBook(book1);
        library.classifyBooks();
        assertEquals(2, library.getGenreSectionCounter().size());
    }

}
