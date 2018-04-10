import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class P24BookLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfBooks = Integer.parseInt(scanner.nextLine());
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        HashMap<String, Double> authorRevenue = new HashMap<>();


        for (int i = 0; i < numberOfBooks; i++) {
//            format {title} {author} {publisher} {release date} {ISBN} {price}.
            String[] tokens = scanner.nextLine().split(" ");

            String title = tokens[0];
            String author = tokens[1];
            String publisher = tokens[2];
            LocalDate releaseDate = LocalDate.parse(tokens[3], dateFormat);
            String isbn = tokens[4];
            Double price = Double.parseDouble(tokens[5]);

            Book currentBook = new Book(title, author, publisher, releaseDate, isbn, price); // kinda useless

            if (!authorRevenue.containsKey(author)) {
                authorRevenue.put(author, 0.0);
            }

            authorRevenue.put(author, authorRevenue.get(author) + price);
        }

        authorRevenue.entrySet().stream()
                .sorted((r1, r2) -> { // sorted needs a -1/1/0 return
                int comparisonResult = r2.getValue().compareTo(r1.getValue()); // r2 compare to r1 is in descending order

                if (comparisonResult == 0) { //ako sa ravni
                    return r1.getKey().compareTo(r2.getKey()); // r1 compare to r2 is in ascending order
                }

                return comparisonResult;
                }).forEach(author -> {
            System.out.printf("%s -> %.2f%n", author.getKey(), author.getValue());
        });
        //main ends here
    }
}

class Book {
//    the title, author, publisher, release date, ISBN-number and price.
    private String title;

    private String author;

    private String publisher;

    private LocalDate date;
    private String isbn;
    private double price;
    public Book(String title, String author, String publisher, LocalDate date, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.date = date;
        this.isbn = isbn;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

//class Author {
//    private String name;
//    private List<Book> books;
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setBooks(List<Book> books) {
//        this.books = books;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public List<Book> getBooks() {
//        return books;
//    }
//
//    public Author(String name, List<Book> books) {
//        this.name = name;
//        this.books = books;
//    }
//
//    public Author() {
//        this.books = new ArrayList<Book>();
//    }
//}