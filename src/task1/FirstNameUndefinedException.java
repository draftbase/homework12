package task1;

public class FirstNameUndefinedException extends Exception {
    public FirstNameUndefinedException(){
        super("imię jest nullem lub ma mniej niż 2 znaki");
    }
}
