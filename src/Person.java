/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
public class Person {


    //-------INITIALIZE------
    protected String firstName; // First name variable
    protected String lastName; // Last name variable

    //-------CONSTRUCTOR METHOD------
    public Person(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;

    }

    //-------CLASS METHOD(S)------
    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

}
