package Exceptions;

public class CharacterNameMissingException extends Throwable {

    public CharacterNameMissingException(){
        super("Missing name for character");
    }
}
