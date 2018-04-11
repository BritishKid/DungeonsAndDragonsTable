
import Exceptions.CharacterSheetSaveFaliureException;
import Objects.CharacterDetails;
import org.junit.After;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CreateSheetTest {

    private CreateSheet createSheet = new CreateSheet();
    private File characterSheet;

    //mocks
    private CharacterDetails mockPlayer = mock(CharacterDetails.class);

    @After
    public void deleteJsonsCreated(){
        try {
            characterSheet.delete();
        } catch (NullPointerException e){
        }
    }

    @Test
    public void whenCreatingNewSheetthenUseCharacterNameAndPlayerNameForFileName() throws IOException, CharacterSheetSaveFaliureException {
        //given
        characterSheet = new File("src/main/resources/characterSheets/Test Character - Test Player.json");

        when(mockPlayer.getCharacterName()).thenReturn("Test Character");
        when(mockPlayer.getPlayerName()).thenReturn("Test Player");

        //when
        createSheet.createSheetFromPlayer(mockPlayer);

        //the
        assertTrue(characterSheet.exists());
    }

    @Test (expected = CharacterSheetSaveFaliureException.class)
    public void givenNullValueForCharacterNameValuewhenCreatingNewSheetthenExceptionThrown() throws CharacterSheetSaveFaliureException, IOException {
        //given
        when(mockPlayer.getCharacterName()).thenReturn(null);
        when(mockPlayer.getPlayerName()).thenReturn("Valid String");

        //when
        createSheet.createSheetFromPlayer(mockPlayer);

    }

    @Test (expected = CharacterSheetSaveFaliureException.class)
    public void givenNullValueForPlayerNameValuewhenCreatingNewSheetthenExceptionThrown() throws IOException, CharacterSheetSaveFaliureException {
        //given
        when(mockPlayer.getPlayerName()).thenReturn(null);
        when(mockPlayer.getCharacterName()).thenReturn("Valid String");

        //when
        createSheet.createSheetFromPlayer(mockPlayer);

    }

    @Test (expected = CharacterSheetSaveFaliureException.class)
    public void givenEmptyValueForCharacterNameValuewhenCreatingNewSheetthenExceptionThrown() throws IOException, CharacterSheetSaveFaliureException {
        //given
        when(mockPlayer.getCharacterName()).thenReturn("");
        when(mockPlayer.getPlayerName()).thenReturn("Valid String");

        //when
        createSheet.createSheetFromPlayer(mockPlayer);

    }

    @Test (expected = CharacterSheetSaveFaliureException.class)
    public void givenEmptyValueForPlayerNameValuewhenCreatingNewSheetthenExceptionThrown() throws IOException, CharacterSheetSaveFaliureException {
        //given
        when(mockPlayer.getPlayerName()).thenReturn("");
        when(mockPlayer.getCharacterName()).thenReturn("Valid String");

        //when
        createSheet.createSheetFromPlayer(mockPlayer);

    }





}
