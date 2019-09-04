import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

Book book;

@Before
    public void setUp(){
    book = new Book("Harry Potter","JK","Fantasy");
}

@Test
    public void hasTitle(){
    assertEquals("Harry Potter", book.title);
    }

@Test
    public void hasAuthor(){
    assertEquals("JK", book.author);
    }

@Test
    public void hasGenre(){
    assertEquals("Fantasy", book.genre);
    }

}
