package Exceptions;

public class PlayerNameMissingException extends Throwable {

    public PlayerNameMissingException(){
        super("Missing name for player");
    }
}
