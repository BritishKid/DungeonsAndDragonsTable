////Generates characters from given set of parameters
//
//import Objects.CharacterClass;
//import Objects.CharacterDetails;
//import Objects.PCClass;
//
//public class CharacterGeneration {
//
//    public CharacterDetails totallyRandomCharacterGeneration(CharacterDetails totalRandomCharacter, ReadFromJson readFromJson){ //double check DI?
//        //class
//        String randomClass = readFromJson.getRandomFromJSONList("ClassList.json");
//        String randomArchetype = readFromJson.getRandomFromJSONList(randomClass + ".json", "Archetype");
//
//        PCClass pcClass = new PCClass();
//        pcClass.setClassName(randomClass);
//        pcClass.setArchetype(randomArchetype);
//
//        //reads class json picked random skills and puts into object
//        pcClass = readFromJson.getClassInformation(randomClass);
//
//        //all other stuff needed for PCClass object to save into sheet
//
//        CharacterClass characterClass = new CharacterClass();
//        characterClass.setPcClass(pcClass);
//        characterClass.setClassLevel(DiceRoller.rollD20());
//        characterClass.setMainClass(true);
//
//        totalRandomCharacter.addNewClass(characterClass);
//
//
//        //attributes
//
//        //race
//
//        //level up
//
//        return totalRandomCharacter;
//    }
//}
