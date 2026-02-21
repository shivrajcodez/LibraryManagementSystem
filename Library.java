import java.util.ArrayList;
import java.util.Iterator;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }
    public void addBook(Book book) {
        this.books.add(book);
    }

    public Book findBook(String title) {
        for (Book book : books) {
            if(book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
    public void displayBooks() {
        boolean found = false;
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + " by " + book.getAuthor() +
                    " (Available: " + book.isAvailable() + ")");
            found = true;
        }
        if (!found) {
            System.out.println("No available books in the library");
        }
    }
    public void removeBook(String title){
        Iterator<Book> iterator = books.iterator();
        while(iterator.hasNext()){
            Book book = iterator.next();
            if(book.getTitle().equalsIgnoreCase(title)) {
                iterator.remove();
                System.out.println("Book " + title + " has removed successfully");
                return;
            }
        }
        System.out.println("Book" + title + " is not available");
    }

    public void editBooks(String title , String NewTitle, String newAuthor, String newPublication){
        Book book = findBook(title);
        if(book != null){
            book.setTitle(NewTitle);
            book.setAuthor(newAuthor);
            book.setPublication(newPublication);
            System.out.println("Book " + title + " has edited successfully");
        }else{
            System.out.println("Book " + title + " is not available");
        }
    }
}
