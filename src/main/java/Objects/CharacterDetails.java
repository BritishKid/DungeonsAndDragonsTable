package Objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CharacterDetails {
    
    private String characterName;
    private String playerName; //todo will this be linked to an account or dm/campaign/session?
    private int experiencePoints;
    private int hitPointsMaximum;
    private int hitPointsCurrent;
    private int proficiencyBonus;

    private List<CharacterClass> characterClasses;
    private Race race;

    private Map<String, Attribute> attributes;

    private PCBackground background;
    private String alignment;
    private Map<String, Skill> skills;
    private List<String> languages;

    private List<Equipment> playersEquipment;

    //getters
    public String getCharacterName() {
        return characterName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public int getHitPointsMaximum() {
        return hitPointsMaximum;
    }

    public int getHitPointsCurrent() {
        return hitPointsCurrent;
    }

    public int getProficiencyBonus() {
        return proficiencyBonus;
    }

    public List<CharacterClass> getCharacterClasses() {
        return characterClasses;
    }

    public Race getRace() {
        return race;
    }

    public Map<String, Attribute> getAttributes() {
        return attributes;
    }

    public PCBackground getBackground() {
        return background;
    }

    public String getAlignment() {
        return alignment;
    }

    public Map<String, Skill> getSkills() {
        return skills;
    }

    public List<Equipment> getPlayersEquipment() {
        return playersEquipment;
    }

    public List<String> getLanguages() {
        return languages;
    }

    //setters
    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public void setHitPointsMaximum(int hitPointsMaximum) {
        this.hitPointsMaximum = hitPointsMaximum;
    }

    public void setHitPointsCurrent(int hitPointsCurrent) {
        this.hitPointsCurrent= hitPointsCurrent;
    }

    public void setProficiencyBonus(int proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
    }

    public void setCharacterClasses(List<CharacterClass> characterClasses) {
        this.characterClasses = characterClasses;
    }
    public void setRace(Race race) {
        this.race = race;
    }

    public void setAttributes(Map<String, Attribute> attributes) {
        this.attributes = attributes;
    }

    public void setBackground(PCBackground background) {
        this.background = background;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public void setSkills(Map<String, Skill> skills) {
        this.skills = skills;
    }

    public void setPlayersEquipment(List<Equipment> playersEquipment) {
        this.playersEquipment = playersEquipment;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    //add single object to lists
    public void addNewClass(CharacterClass characterClass){
        if(this.characterClasses == null){
            this.characterClasses = new ArrayList<>();
        }
        characterClasses.add(characterClass);
    }

    public void addNewLanguage(String language){
        if(this.languages == null){
            this.languages = new ArrayList<String>();
        }
        languages.add(language);
    }

    public void addNewEquipment(Equipment equipment){
        if(this.playersEquipment == null){
            this.playersEquipment = new ArrayList<>();
        }
        playersEquipment.add(equipment);
    }

    //todo update when needed and move to correct class
//    public void calculateSkillValue(String attributeUpdated) {
//        int skillValue = 0;
//
//        getSkills().get();
//        if (isSkillProficiency()) {
//            skillValue = skillValue + proficiencyModifier; //if proficient add modifier
//        }
//        if (isSkillExpertise()) {
//            skillValue = skillValue + proficiencyModifier; //if expertise add modifier
//        }
//        skillValue = skillValue + getSkillOtherModifier(); // add any bonus modifiers
//
//        this.skillValue = skillValue;
//    }

}
