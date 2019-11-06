package task1;

public class IncorrectAgeException extends Exception{
    public IncorrectAgeException(){
        super("Za nieski wiek przy tworzeniu osoby");
    }
}
