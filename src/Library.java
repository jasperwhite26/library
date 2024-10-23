public class Library {
    public String name;
    public static int totalBooks;

    public void addBooks(int numBooks){
        totalBooks += numBooks;
    }

    public static int getTotalBooks(){
        return totalBooks;
    }

}
