import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    public List<Book> books ;

    public Library(List<Book> books) {
        this.books = new ArrayList<>();
    }



    public void barrowBook(Book book, String borrowerId){

    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public void removeBook(Book book){
        this.books.remove(book);
    }

    public List<Book> getBooks(){
        return this.books;
    }

    public  Book getBook(int index){
        return this.books.get(index);
    }

    public List<Book> searchBookByTitle(String query){
        return this.books.stream()
                .filter(b -> b.name.startsWith(query))
                .map(Book.class::cast)
                .collect(Collectors.toList());
    }

    public List<Book> searchBookByAuthor(String name){

        return this.books.stream()
                .filter(b-> b.author.startsWith(name))
                .map(Book.class::cast)
                .collect(Collectors.toList());
    }

    public List<Book> filterByYear(int startingYear , int endingYear){
        return this.books.stream()
                .filter(b -> Integer.parseInt(b.publishYear) >= startingYear && Integer.parseInt(b.publishYear) <= endingYear)
                .map(Book.class::cast)
                .collect(Collectors.toList());
    }

    public int countAllBookPages() {
        int totalPages = 0;
        for (int i = 0; i<= books.size() -1 ; i++) {
            totalPages += Integer.parseInt(books.get(i).pages);
        }
        return totalPages;
    }
}
