//import Objects.*;
//import org.junit.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.Assert.assertEquals;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//public class CharacterGenerationTest {
//
//    private CharacterGeneration characterGeneration = new CharacterGeneration();
//    private CharacterDetails totalRandomCharacter = new CharacterDetails();
//    private PCClass testPCClass = new PCClass();
//
//    //mocks
//    private ReadFromJson mockReadFromJson = mock(ReadFromJson.class);
//
//    @Test //todo finish test
//    public void givenUserCreatesRandomCharacterthenCharacterIsCreated(){
//        //given
//        buildtestPCClass();
//        when(mockReadFromJson.getRandomFromJSONList("ClassList.json")).thenReturn("Class");
//        when(mockReadFromJson.getRandomFromJSONList("Class.json", "Archetype")).thenReturn("Archetype");
//        when(mockReadFromJson.getClassInformation("Class.json")).thenReturn(testPCClass);
//        //when
//        CharacterDetails characterDetails = characterGeneration.totallyRandomCharacterGeneration(totalRandomCharacter, mockReadFromJson);
//
//        //then
//        assertEquals("Class", characterDetails.getCharacterClasses().get(0).getPcClass().getClassName());
//        assertEquals("Archetype", characterDetails.getCharacterClasses().get(0).getPcClass().getArchetype());
//    }
//
//
//    //objects built for testing
//    public void buildtestPCClass(){
//        testPCClass.setClassName("Class");
//        testPCClass.setHitDice(10);
//        testPCClass.setSpellCaster(false);
//        testPCClass.setSkillProficiency(buildSkillList());
//        testPCClass.setClassStartingEquipment(buildEquipmentList());
//        testPCClass.setArchetype("Archetype");
//        testPCClass.setClassFeatures(buildFeatureList());
//    }
//
//    private List<Skill> buildSkillList() {
//        List<Skill> listOfSkills = new ArrayList<>();
//        for (int i = 1; i <= 4; i++){
//            Skill skill = new Skill();
//            skill.setSkillName("Skill" + i);
//            skill.setSkillAttribute("Attribute");
//            skill.setSkillDescription("Test skill");
//            listOfSkills.add(skill);
//        }
//        return listOfSkills;
//    }
//
//    private List<Equipment> buildEquipmentList() {
//        List<Equipment> equipmentList = new ArrayList<>();
//        for (int i = 1; i <= 4; i++){
//            Equipment equipment = new Equipment();
//            equipment.setName("Equipment"+i);
//            equipment.setType("Test");
//            equipment.setWeight(0);
//            equipment.setValue(0);
//            equipmentList.add(equipment);
//        }
//
//        return equipmentList;
//    }
//
//    private List<ClassFeature> buildFeatureList() {
//        List<ClassFeature> classFeatures = new ArrayList<>();
//        for (int i = 1; i <= 4; i++){
//            ClassFeature classFeature = new ClassFeature();
//            classFeature.setFeatureName("Feature"+i);
//            classFeature.setFeatureDescription("Test Feature");
//            classFeature.setLevelForFeature(i);
//        }
//        return classFeatures;
//    }
//}
