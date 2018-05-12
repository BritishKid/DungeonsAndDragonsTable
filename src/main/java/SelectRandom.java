import java.util.List;
import java.util.Random;

public class SelectRandom {

    public Object getRandomFromList(List<Object> selectionList){
        Random rand = new Random();

        return selectionList.get(rand.nextInt(selectionList.size()));
    }
}
