public class App {
    public static void main(String[] args) {

        Library A = new Library();
        A.name = "A";
        A.addBooks(100);
        System.out.println("Library A added: " + Library.getTotalBooks());

        Library B = new Library();
        B.name = "B";
        B.addBooks(150);
        System.out.println("Total books: " + Library.getTotalBooks());
    }
}
