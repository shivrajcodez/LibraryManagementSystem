public class ManageLibrary {
    private Library library;
    public ManageLibrary() {
        this.library = new Library();
    }
    public void addBook(String title, String author, String publication){
        Book newBook = new Book(title,author,publication);
        library.addBook(newBook);
        System.out.println("\nBook added Successfully");
    }
    public void SearchBook(String title){
        Book book = library.findBook(title);
        if(book != null){
            System.out.println("Book is available");
            if(book.isAvailable()){
                System.out.println("You can issue this book");
            }else{
                System.out.println("Book is not available");
            }
        }else{
            System.out.println("Book not found");
        }
    }
    public void displayBooks(){
        library.displayBooks();
    }
    public void removeBook(String title){
        library.removeBook(title);
    }
    public void editBook(String title, String newTitle, String newAuthor, String newPublication){
        library.editBooks(title, newTitle, newAuthor, newPublication);

    }
}