import Exceptions.CharacterNameMissingException;
import Exceptions.PlayerNameMissingException;
import Objects.CharacterDetails;
import org.junit.After;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CreateSheetTest {

    CreateSheet createSheet = new CreateSheet();
    File characterSheet;

    //mocks
    CharacterDetails mockPlayer = mock(CharacterDetails.class);

    @After
    public void deleteJsonsCreated(){
        try {
            characterSheet.delete();
        } catch (NullPointerException e){
            return;
        }
    }

    @Test
    public void whenCreatingNewSheetthenUseCharacterNameAndPlayerNameForFileName() throws Exception, CharacterNameMissingException, PlayerNameMissingException {
        //given
        characterSheet = new File("src/main/resources/characterSheets/Test Character - Test Player.json");

        when(mockPlayer.getCharacterName()).thenReturn("Test Character");
        when(mockPlayer.getPlayerName()).thenReturn("Test Player");

        //when
        createSheet.createSheetFromPlayer(mockPlayer);

        //the
        assertTrue(characterSheet.exists());
    }

    @Test (expected = CharacterNameMissingException.class)
    public void givenNullValueForCharacterNameValuewhenCreatingNewSheetthenExceptionThrown() throws Exception, CharacterNameMissingException, PlayerNameMissingException {
        //given
        when(mockPlayer.getCharacterName()).thenReturn(null);
        when(mockPlayer.getPlayerName()).thenReturn("Valid String");

        //when
        createSheet.createSheetFromPlayer(mockPlayer);

    }

    @Test (expected = PlayerNameMissingException.class)
    public void givenNullValueForPlayerNameValuewhenCreatingNewSheetthenExceptionThrown() throws Exception, CharacterNameMissingException, PlayerNameMissingException {
        //given
        when(mockPlayer.getPlayerName()).thenReturn(null);
        when(mockPlayer.getCharacterName()).thenReturn("Valid String");

        //when
        createSheet.createSheetFromPlayer(mockPlayer);

    }

    @Test (expected = CharacterNameMissingException.class)
    public void givenEmptyValueForCharacterNameValuewhenCreatingNewSheetthenExceptionThrown() throws Exception, CharacterNameMissingException, PlayerNameMissingException {
        //given
        when(mockPlayer.getCharacterName()).thenReturn("");
        when(mockPlayer.getPlayerName()).thenReturn("Valid String");

        //when
        createSheet.createSheetFromPlayer(mockPlayer);

    }

    @Test (expected = PlayerNameMissingException.class)
    public void givenEmptyValueForPlayerNameValuewhenCreatingNewSheetthenExceptionThrown() throws Exception, CharacterNameMissingException, PlayerNameMissingException {
        //given
        when(mockPlayer.getPlayerName()).thenReturn("");
        when(mockPlayer.getCharacterName()).thenReturn("Valid String");

        //when
        createSheet.createSheetFromPlayer(mockPlayer);

    }





}
