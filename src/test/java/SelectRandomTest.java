import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SelectRandomTest {

    SelectRandom selectRandom = new SelectRandom();

    @Test
    public void givenListWithOneObjectthenReturnThatObject() throws Exception {
        //given
        List<Object> singleObjectList = new ArrayList<>();
        singleObjectList.add("Only object");

        //when
        Object selectedObject = selectRandom.getRandomFromList(singleObjectList);

        //then
        assertEquals("Only object", selectedObject);
    }

    @Test
    public void givenListWithMultipleObjectthenReturnOneObject() throws Exception {
        //given
        List<Object> multipleObjectList = new ArrayList<>();
        for(int i = 1; i<8; i++ ){
            multipleObjectList.add(i);
        }
        //when
        Object selectedObject = selectRandom.getRandomFromList(multipleObjectList);

        //then
        assertTrue( 0 < (int) selectedObject );
        assertTrue( 8 > (int) selectedObject );
    }


}