import Exceptions.CharacterSheetSaveFaliureException;
import Objects.CharacterDetails;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;

class CreateSheet {
    private static org.apache.log4j.Logger log = Logger.getLogger(CreateSheet.class);

    void createSheetFromPlayer(CharacterDetails player) throws IOException, CharacterSheetSaveFaliureException {

        isAbleToSave(player);

        String fileName = player.getCharacterName() + " - " + player.getPlayerName();

        File characterSheet = new File("src/main/resources/characterSheets/" + fileName + ".json");
        characterSheet.createNewFile();
        log.debug("Character sheet created with file name: " + fileName);
    }


    private void isAbleToSave(CharacterDetails player) throws CharacterSheetSaveFaliureException {
        StringBuilder errorMessage = new StringBuilder();
        Boolean hasFailed = false;

        if(player.getCharacterName() == null || player.getCharacterName().isEmpty()) {
            log.warn("No character name present when saving character sheet to JSON");
            errorMessage.append("No Character Name, ");
            hasFailed = true;
        }
        if(player.getPlayerName() == null || player.getPlayerName().isEmpty()) {
            log.warn("No player name present when saving character sheet to JSON");
            errorMessage.append("No Player Name, "); //text isn't perfect will need altering to be tidier
            hasFailed = true;
        }
        //todo add more validations

        if(hasFailed){
            throw new CharacterSheetSaveFaliureException(errorMessage.toString());
        }
    }
}
