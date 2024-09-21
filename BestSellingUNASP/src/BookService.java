import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookService {


    public int numberOfBookByAuthor(List<Book> livros, String author) {
        int count = 0;

        for (Book book : livros) {
            if(book.getAuthor().equals(author)) {
                count++;
            }
        }
        return count;
    }

    public List<String> isolatedListOfAuthors (List<Book> livros) {

        Set<String> authors = new HashSet<String>();

        for (Book book : livros) {
            authors.add(book.getAuthor());

        }
        return new ArrayList<>(authors);
    }

    public List<String> listOfTitlesByAuthor (List<Book> livros, String author) {

        List<String> titles = new ArrayList<>();

        for (Book book : livros) {
            if(book.getAuthor().equals(author)) {
                titles.add(book.getTitle());
            }
        }
        return titles;
    }

    public List<String> ratingsListWithTitlesAndAuthors (List<Book> livros, String userRating ) {
        Set<String> ratings = new HashSet<>();

        for (Book books : livros) {
            if(books.getUserRating().equals(userRating)) {
                ratings.add(books.getTitle() + " de " + books.getAuthor() + " ");
            }
        }
        return new ArrayList<>(ratings);
    }

    public List<String> priceOfBooksByAuthor (List<Book> livros, String author) {

        List<String> prices = new ArrayList<>();

        for (Book book : livros) {
            if(book.getAuthor().equals(author)) {
                prices.add(book.getTitle() +" - " + book.getPrice());
            }
        }
        return prices;

    }
}
