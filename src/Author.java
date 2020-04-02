/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

import java.util.ArrayList;
import java.util.List;

public class Author extends Person {

    //-------INITIALIZE------
//    private List books; // Raw type
    private List<String> books; // parameterized type


    //-------CONSTRUCTOR METHOD------
    public Author(String firstName, String lastName) {
        super(firstName, lastName);
//        books = new ArrayList(); //raw type
        books = new ArrayList<>(); // parameterized type
    }


    //-------CLASS METHOD(S)------
    /**
     * @deprecated Use publishedBooks instead
     */
    @Deprecated
    public List<String> getBooks() {
        return books;
    }

    public List<String> publishedBooks() {
        return books;
    }

    public void addBook(String book) {
        books.add(book);
    }

    @Override
    public String fullName() {
        return String.format("%s, %s", lastName, firstName);
    }
}
