

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DatasetReader datasetReader = new DatasetReader();
        List<Book> books = datasetReader.readDataset("src/data.csv");
        BookService bookService = new BookService();
        int countBooks = bookService.numberOfBookByAuthor(books, "J.K. Rowling");

        System.out.println(countBooks);

        List<String> listaUnicaDeAuthor = bookService.isolatedListOfAuthors(books);
        System.out.println(listaUnicaDeAuthor);
        //listaUnicaDeAuthor.forEach(System.out::println);

        List<String> listaDeTitulosPorAutor = bookService.listOfTitlesByAuthor(books, "J.K. Rowling");
        //System.out.println(listaDeTitulosPorAutor);
        listaDeTitulosPorAutor.forEach(System.out::println);

        List<String> listaDeTitulosEAuthoresPorAvalicao = bookService.ratingsListWithTitlesAndAuthors(books, "4.9");
        System.out.println(listaDeTitulosEAuthoresPorAvalicao);
        //listaDeTitulosEAuthoresPorAvalicao.forEach(System.out::println);

        List<String> listaDePrecosPorAutor = bookService.priceOfBooksByAuthor(books, "George R. R. Martin");
        //System.out.println(listaDePrecosPorAutor);
        listaDePrecosPorAutor.forEach(System.out::println);




    }
}