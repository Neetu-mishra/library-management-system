import java.util.ArrayList;

public class library {
    private ArrayList<book> books = new ArrayList<>();

    public void addBook(book book) {
        books.add(book);
    }

    public void issueBook(String title) {
        for (book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isIssued()) {
                book.issueBook();
                System.out.println(title + " has been issued.");
                return;
            }
        }
        System.out.println("Book not available.");
    }

    public void returnBook(String title) {
        for (book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isIssued()) {
                book.returnBook();
                System.out.println(title + " has been returned.");
                return;
            }
        }
        System.out.println("Invalid return request.");
    }

    public void showBooks() {
        for (book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + 
                (book.isIssued() ? " (Issued)" : " (Available)"));
        }
    }
}
