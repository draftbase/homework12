package task1;

public class LastNameUndefinedException extends Exception {
    public LastNameUndefinedException(){
        super("nazwisko jest nullem lub ma mniej niż 2 znaki");
    }
}
