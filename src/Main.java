public class Main {

    public static void main(String[] args) {

        Author author = new Author("Sandi", "Metz"); // Create a new instance of and Author

        author.addBook("Practical Object-Oriented Design in Ruby"); // Add book to Author List
        author.addBook("99 Bottles of OOP"); // Add book to Author List

        for (String book: author.publishedBooks()) { // iterate through the books

            System.out.println(book); // print the books

        }

    }

}
