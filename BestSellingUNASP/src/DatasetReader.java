

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DatasetReader {
    public List<Book> readDataset(String file) {
        List<Book> books = new ArrayList<>();
        String line = "";
        String splitBy = ",(?=([^\"]*\"[^\"]*\")*[^\"]*$)";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            br.readLine(); // Skip header line
            while ((line = br.readLine()) != null) {
                String[] data = line.split(splitBy);
                if (data.length >= 7) {
                    String title = data[0].replace("\"", "");
                    String author = data[1].replace("\"", "");
                    String userRating = data[2].replace("\"", "");
                    String reviews = data[3].replace("\"", "");
                    String price = data[4].replace("\"", "");
                    String year = data[5].replace("\"", "");
                    String genre = data[6].replace("\"", "");

                    books.add(new Book(title, author, userRating, reviews, price, year, genre));
                } else {
                    System.err.println("Pulando linha malformada: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return books;
    }
}