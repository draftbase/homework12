package task1;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel)
            throws NameUndefinedException, IncorrectAgeException, FirstNameUndefinedException, LastNameUndefinedException {
        checkNameUndefinedException(firstName, lastName);
        checkIncorrectAgeException(age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    private void checkIncorrectAgeException(int age) throws IncorrectAgeException {
        if(age < 1){
            throw new IncorrectAgeException();
        }
    }

    private void checkNameUndefinedException(String firstName, String lastName) throws NameUndefinedException {
        if(firstName == null || lastName == null || firstName.length() <= 2 || lastName.length() <=2) {
            throw new NameUndefinedException();
        }
    }

    private void checkFirstNameUndefinedException(String firstName) throws FirstNameUndefinedException {
        if(firstName == null || firstName.length() <= 2) {
            throw new FirstNameUndefinedException();
        }
    }

    private void checkLastNameUndefinedException(String lastName) throws LastNameUndefinedException {
        if(lastName == null || lastName.length() <=2) {
            throw new LastNameUndefinedException();
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws FirstNameUndefinedException {
        checkFirstNameUndefinedException(firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws LastNameUndefinedException {
        checkLastNameUndefinedException(lastName);
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IncorrectAgeException {
        checkIncorrectAgeException(age);
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                '}';
    }

}
