import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("LOTR", "Fantasy");
    }

    @Test
    public void canGetTitle(){
        assertEquals("LOTR", book.getTitle());
    }

    @Test
    public void canGetGenre(){
        assertEquals("Fantasy", book.getGenre());
    }
}
