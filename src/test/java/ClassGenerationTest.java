import Objects.CharacterClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ClassGenerationTest {

    private ClassGeneration classGeneration = new ClassGeneration();
    private CharacterClass generatedClass = new CharacterClass();

    //mocks
    private SelectRandom selectRandomMock = mock(SelectRandom.class);

    @Test
    public void getsRandomStringFromListThenSetsAsClassName() {
        //given
        when(selectRandomMock.getRandomFromList((anyObject()))).thenReturn("Random Class");

        //when
        classGeneration.getRandomClass(generatedClass, selectRandomMock);

        //then
        assertEquals("Random Class", generatedClass.getClassName());
    }

    @Test
    public void getsRandomClassLevel() {
        //when
        classGeneration.getRandomClass(generatedClass, selectRandomMock);

        //then
        assertTrue(generatedClass.getClassLevel() != 0);
    }

    @Test
    public void whenGettingSingleClassthenSetMainClassToTrue() {
        //when
        classGeneration.getRandomClass(generatedClass, selectRandomMock);

        //then
        assertTrue(generatedClass.isMainClass());
    }

    @Test
    public void whenGeneratingRandomClassthenReturnsFullClass() throws Exception {
        //given
        when(selectRandomMock.getRandomFromList((anyObject()))).thenReturn("Random Class");

        //when
        classGeneration.getRandomClass(generatedClass, selectRandomMock);

        //then
        assertEquals("Random Class", generatedClass.getClassName());
        assertTrue(generatedClass.isMainClass());
        assertTrue(generatedClass.getClassLevel() != 0);
    }
}
