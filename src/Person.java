//14. Person
//Write a class with the name Person.
// The class needs three fields (instance variables)
// with the names  firstName, lastName of type String and age of type int.

public class Person{
    public static void main(String[] args) {
        Person person = new Person();

        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());

    }

    String firstName, lastName;
    int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        this.lastName=lastName;
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age=age;
        if (age <= 0 || age >= 100) {
            System.out.println( "" );
        } else {
            age =0;
        }
    }

    public boolean isTeen() {
        boolean result;
        result = age > 12 && age < 20;
        return result;

    }

    public String getFullName() {
        String fullName;

        if (firstName == null && lastName == null) {
            fullName = "";
        } else if (firstName != null && lastName==null) {
            fullName = firstName;
        } else if (lastName != null && firstName==null ) {
            fullName = lastName;
        } else {
            fullName = firstName.concat( lastName );
        }return fullName;
    }

    public void IsEmpty() {

        firstName = "";
        lastName = "";

        System.out.println( firstName.isEmpty() );
        System.out.println( lastName.isEmpty() );
        ;
    }

}



