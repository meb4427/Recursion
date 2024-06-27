import java.util.ArrayList;

class Book{
    private static String author = "Stephen Hawkings";
    private String title;
    private String year;

    public Book(String title, String year) {
        this.title = title;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }
}

class MyClass {   
    public static void printBookArray(ArrayList<Book> books) {
        for (Book book : books) {
            System.out.println(String.format("%s"+" written by "+"%s" + " in " + "%s", book.getTitle(), book.getAuthor(), book.getYear()));
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("How Did It All Begin?", "2021"));
        books.add(new Book("The Theory of Everything", "2010"));
        books.add(new Book("God Created the Integers", "2006"));
    
        printBookArray(books);
    }
}