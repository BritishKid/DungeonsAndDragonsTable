package Objects;

import java.util.List;

public class PlayerCharacter {

    private String characterName;
    private String playerName; //todo will this be lnked to an account?
    private int experiencePoints;
    private int hitPointsMaximum;
    private int hitPointsCurrent;
    private int proficiencyBonus;

    private List<Classes> classes;
    private Race race;

    private Attributes attributes;

    private PCBackground background;
    private String alignment;
    private List<Skills> skills;

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

    public List<Classes> getClasses() {
        return classes;
    }

    public Race getRace() {
        return race;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public PCBackground getBackground() {
        return background;
    }

    public String getAlignment() {
        return alignment;
    }

    public List<Skills> getSkills() {
        return skills;
    }

    public List<Equipment> getPlayersEquipment() {
        return playersEquipment;
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

    public void setClasses(List<Classes> classes) {
        this.classes = classes;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public void setBackground(PCBackground background) {
        this.background = background;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public void setSkills(List<Skills> skills) {
        this.skills = skills;
    }

    public void setPlayersEquipment(List<Equipment> playersEquipment) {
        this.playersEquipment = playersEquipment;
    }
}
