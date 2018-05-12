//Gets the information for a characters class, using a passed in value or random if empty
//Multiclass??

import Objects.CharacterClass;
import Objects.PCClass;

import java.util.*;

public class ClassGeneration {

    private static final List<Object> LISTOFCLASSES =
            Collections.unmodifiableList(Arrays.asList(
                    "Barbarian",
                    "Bard",
                    "Cleric",
                    "Druid",
                    "Fighter",
                    "Monk",
                    "Paladin",
                    "Ranger",
                    "Rogue",
                    "Sorcerer",
                    "Warlock",
                    "Wizard"));

    //Passing through no input generates random class
    public CharacterClass getRandomClass(CharacterClass characterClass, SelectRandom selectRandom) {
        String randomClassName = (String) selectRandom.getRandomFromList(LISTOFCLASSES);
        characterClass.setClassName(randomClassName);
        characterClass.setClassLevel(DiceRoller.rollD20());
        characterClass.setMainClass(true);

        return characterClass;
    }
}
