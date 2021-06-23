public class Contact implements Comparable<Contact> {

    private String firstName, lastName, phone;


    public int compareTo(Contact other) {
        String otherFirstName = other.getFirstName();
        String otherLastName = other.getLastName();

        if (lastName.equals(otherLastName)) {
            return firstName.compareTo(otherFirstName);
        } else {
            return lastName.compareTo(otherLastName);
        }
    }

    //return true if name of the contact matches the name of the parameter
    public boolean equals(Contact other) {
        return (lastName.equals(other.getLastName()) &&
        firstName.equals(other.getFirstName()));
    }

    public String toString() {
        return lastName + ", " + firstName + "\t" + phone;
    }

    public Contact(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
