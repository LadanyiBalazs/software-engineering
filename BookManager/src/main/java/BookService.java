import java.util.ArrayList;
import java.util.List;

/**
 * Provides basic CRUD operations for a list of books.
 */
public class BookService {
    private List<Book> books = new ArrayList<>();

    /**
     * Gets all books in the list.
     *
     * @return A list of all books in the list.
     */
    public List<Book> getAllBooks() {
        return books;
    }

    /**
     * Gets a book by its id.
     *
     * @param id The id of the book to get.
     * @return The book with the given id, or null if no such book exists.
     */
    public Book getBookById(int id) {
        return books.stream()
                .filter(book -> book.getId() == id)
                .findFirst()
                .orElse(null);
    }

    /**
     * Adds a book to the list.
     *
     * @param book The book to add.
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Updates a book in the list.
     *
     * @param book The book to update.
     */
    public void updateBook(Book book) {
        int index = books.indexOf(getBookById(book.getId()));
        if (index != -1) {
            books.set(index, book);
        }
    }

    /**
     * Deletes a book from the list.
     *
     * @param id The id of the book to delete.
     */
    public void deleteBookById(int id) {
        books.removeIf(book -> book.getId() == id);
    }

    /**
     * Gets all books with the given title.
     *
     * @param title The title to filter by.
     * @return A list of all books with the given title.
     */
    public List<Book> getBooksByTitle(String title) {
        return books.stream().filter(book -> book.getTitle().equals(title)).toList();
    }

    /**
     * Gets all books by the given author.
     *
     * @param author The author to filter by.
     * @return A list of all books by the given author.
     */
    public List<Book> getBooksByAuthor(String author) {
        return books.stream().filter(book -> book.getAuthor().equals(author)).toList();
    }

    /**
     * Gets all books with the given rating.
     *
     * @param rating The rating to filter by.
     * @return A list of all books with the given rating.
     */
    public List<Book> getBooksByRating(int rating) {
        return books.stream().filter(book -> book.getRating() == rating).toList();
    }

    /**
     * Gets all books with more pages than the given number.
     *
     * @param pages The minimum number of pages to filter by.
     * @return A list of all books with more pages than the given number.
     */
    public List<Book> getBooksByPagesGreaterThan(int pages) {
        return books.stream().filter(book -> book.getPages() > pages).toList();
    }

    /**
     * Gets all books with fewer pages than the given number.
     *
     * @param pages The maximum number of pages to filter by.
     * @return A list of all books with fewer pages than the given number.
     */
    public List<Book> getBooksByPagesLessThan(int pages) {
        return books.stream().filter(book -> book.getPages() < pages).toList();
    }
}
