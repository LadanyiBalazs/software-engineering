import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        BookService bookService = new BookService();
        logger.info("Book manager started.");

        Book book1 = new Book("To Kill a Mockingbird", 281, "Harper Lee", 4, 1);
        Book book2 = new Book("1984", 328, "George Orwell", 5, 2);
        Book book3 = new Book("The Great Gatsby", 180, "F. Scott Fitzgerald", 3, 3);
        Book book4 = new Book("Pride and Prejudice", 279, "Jane Austen", 4, 4);

        bookService.addBook(book1);
        bookService.addBook(book2);
        bookService.addBook(book3);
        bookService.addBook(book4);

        Book updatedBook = new Book("1984", 328, "George Orwell", 4, 2);
        bookService.updateBook(updatedBook);
        logger.info("Updated book:");
        logger.info(bookService.getBookById(2));

        bookService.deleteBookById(3);
        logger.info("Deleted book:");
        logger.info(bookService.getBookById(3));

        logger.info("Books by title: {}", bookService.getBooksByTitle("1984"));
        logger.info("Books by author: {}", bookService.getBooksByAuthor("Harper Lee"));
        logger.info("Books by rating: {}", bookService.getBooksByRating(4));
        logger.info("Books by pages greater than: {}", bookService.getBooksByPagesGreaterThan(200));
        logger.info("Books by pages less than: {}", bookService.getBooksByPagesLessThan(300));
    }
}