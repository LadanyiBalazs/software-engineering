import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a book with a title, pages, author, rating, and id.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String title;
    private int pages;
    private String author;
    private int rating;
    private int id;
}