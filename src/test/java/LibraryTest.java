import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;

    @Before
    public void before(){
        library = new Library();
    }

    @Test
    public void bookCollectionStartsEarly(){
        assertEquals(0, library.bookCount());
    }
}
