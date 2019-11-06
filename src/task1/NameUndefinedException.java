package task1;

public class NameUndefinedException extends Exception {
    public NameUndefinedException(){
        super("imię lub nazwisko jest nullem lub ma mniej niż 2 znaki");
    }
}
