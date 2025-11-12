import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    public List<Book> books ;

    public Library(List<Book> books) {
        this.books = new ArrayList<>();
    }

    public void barrowBook(Book book){

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

    public List<Book> searchBook(String query){


        return this.books.stream()
                .filter(b -> b.name.startsWith(query))
                .map(Book.class::cast)
                .collect(Collectors.toList());
    }
}
