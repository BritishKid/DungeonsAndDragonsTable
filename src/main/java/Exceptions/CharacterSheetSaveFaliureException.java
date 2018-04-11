package Exceptions;

import java.util.List;

public class CharacterSheetSaveFaliureException extends Throwable {

    public CharacterSheetSaveFaliureException(String errorMessage){
        super (errorMessage);
    }
}
