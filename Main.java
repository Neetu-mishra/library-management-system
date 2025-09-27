public class Main {
    public static void main(String[] args) {
        library library = new library();
        library.addBook(new book("Java Basics", "James Gosling"));
        library.addBook(new book("OOP Concepts", "Bjarne Stroustrup"));

        library.showBooks();

        library.issueBook("Java Basics");
        library.showBooks();

        library.returnBook("Java Basics");
        library.showBooks();
    }
}
