import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        ManageLibrary ml = new ManageLibrary();
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t Central Library \t\t");

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Add Books");
            System.out.println("2. Search Books");
            System.out.println("3. Show Books");
            System.out.println("4. Remove Books");
            System.out.println("5. Edit Books");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline character
            switch (choice) {
                case 1:
                    System.out.print("Enter Title of Books: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author of Books: ");
                    String author = sc.nextLine();
                    System.out.print("Enter Publication: ");
                    String publication = sc.nextLine();
                    ml.addBook(title, author, publication);
                    break;
                case 2:
                    System.out.print("Enter Title of Books: ");
                    String searchTitle = sc.nextLine();
                    ml.SearchBook(searchTitle);
                    break;
                case 3:
                    ml.displayBooks();
                    break;
                case 4:
                    System.out.print("Enter book title to remove: ");
                    String removeTitle = sc.nextLine();
                    ml.removeBook(removeTitle);
                    break; // Added break here
                case 5:
                    System.out.print("Enter book title to edit: ");
                    String editTitle = sc.nextLine();
                    System.out.print("Enter new Title of Books: ");
                    String newTitle = sc.nextLine();
                    System.out.print("Enter new Author of Books: ");
                    String newAuthor = sc.nextLine();
                    System.out.print("Enter new Publication: ");
                    String newPublication = sc.nextLine();
                    ml.editBook(editTitle, newTitle, newAuthor, newPublication);
                    break;
                case 6:
                    System.out.println("Exiting Program.....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");

            }
        }
    }
}