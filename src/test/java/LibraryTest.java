import org.junit.Before;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void setUp(){
        book1 = new Book("Harry Potter1","JK","Fantasy");
        book2 = new Book("Harry Potter2","JK","Fantasy");
        book3 = new Book("Harry Potter3","JK","Fantasy");
        library = new Library();
    }

}
