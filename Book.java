public class Book {
    private String title;
    private String author;
    private boolean available;
    private String publication;

    public Book(String title, String author, String publication) {
        this.title = title;
        this.author = author;
        this.publication = publication;
        this.available = true;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getPublication() {
        return publication;
    }
    public void setPublication(String publication){
        this.publication = publication;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
}