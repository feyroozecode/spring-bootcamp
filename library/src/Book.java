public class Book {
    public String name;
    public String author;
    public String publisher;
    public String isbn;
    public String pages;
    public String publishYear;
    public Book(String name, String author, String publisher, String isbn) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.pages = "0";
        this.publishYear = "0";
    }

    @Override
    public String toString() {
        return this.name + " " + this.author + " " + this.publisher + " " + this.isbn;
    }
}
