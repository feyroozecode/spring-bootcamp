import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static List<Book> books = List.of(
            new Book("Arbaouna Hadith", "Annawawiy","Daar AL-Athar", "012345", "25", "2011"),
            new Book("Umdatul Ahkaam", "Aal Basam","Daar Al-Athar", "0654322", "255", "2018"),
            new Book("KItabu Attawhid", "SHekh. Muhammad IbnABdoulwahab","Daar Al-Athar", "0654322", "277", "1990")
    );
    public static Library library = new Library(books);

    public static void main(String[] args) {
        populateLib();
        listBook();
        searchBook("Arbaouna Hadith");
        filterByYear(2015, 2020);
        System.out.println("ALl book s pages = "+ library.countAllBookPages());
    }

    static void filterByYear(int startYear, int endYear) {
        System.out.println("Filtering by year betwen  "+ startYear+" to "+endYear);
        for (Book book : library.filterByYear(startYear, endYear)) {
            System.out.println(book);
        }
    }

    static void searchBook(String query) {
        System.out.println("Searching for: " + query);
        for(Book found : library.searchBookByTitle(query)){
            System.out.println(found);
        }
    }

    static void listBook(){
        for(Book book:library.books){
            System.out.println(book);
        }
    }


    private static void populateLib() {
        library.books.addAll(books);
    }
}