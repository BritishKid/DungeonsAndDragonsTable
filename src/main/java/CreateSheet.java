import Exceptions.CharacterNameMissingException;
import Exceptions.PlayerNameMissingException;
import Objects.CharacterDetails;

import java.io.File;
import java.io.IOException;

public class CreateSheet {

    public void createSheetFromPlayer(CharacterDetails player) throws IOException, CharacterNameMissingException, PlayerNameMissingException {

        //todo extract method and add validation everything manditory for sheet present
        //todo update to throw single exception which states what is missing?
        if(player.getCharacterName() == null || player.getCharacterName().isEmpty()) {
            throw new CharacterNameMissingException();
        }
        if(player.getPlayerName() == null || player.getPlayerName().isEmpty()) {
            throw new PlayerNameMissingException();
        }

        String fileName = player.getCharacterName() + " - " + player.getPlayerName();

        File characterSheet = new File("src/main/resources/characterSheets/" + fileName + ".json");
        characterSheet.createNewFile();
    }
}
