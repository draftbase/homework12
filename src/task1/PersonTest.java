package task1;

import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Podaj imie");
            String firstName = scanner.nextLine();
            System.out.println("Podaj nazwisko");
            String lastName = scanner.nextLine();
            System.out.println("Podaj wiek");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Podaj pesel");
            String pesel = scanner.nextLine();

            Person person = new Person(firstName, lastName, age, pesel);
            System.out.println(person);
        } catch (IncorrectAgeException e) {
            e.printStackTrace();
        } catch (LastNameUndefinedException | FirstNameUndefinedException e) {
            e.printStackTrace();
        } catch (NameUndefinedException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }


    }
}
