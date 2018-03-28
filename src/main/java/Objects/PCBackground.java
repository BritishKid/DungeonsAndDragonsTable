package Objects;

import java.util.List;


/**
 * Defines a background of the character
 * i.e. Hermit, Soldier, Folk Hero
 *
 */
public class PCBackground {

    private List<Skill> skillProficiency;
    private List<Equipment> backgroundStartingEquipment;

    private List<Proficiency> proficiencies;

    private String backgroundFeature;
    private String speciality;

    private String personalityTrait;
    private String ideal;
    private String bond;
    private String flaw;

    //getters
    public List<Skill> getSkillProficiency() {
        return skillProficiency;
    }

    public List<Equipment> getBackgroundStartingEquipment() {
        return backgroundStartingEquipment;
    }

    public List<Proficiency> getProficiencies() {
        return proficiencies;
    }

    public String getBackgroundFeature() {
        return backgroundFeature;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getPersonalityTrait() {
        return personalityTrait;
    }

    public String getIdeal() {
        return ideal;
    }

    public String getBond() {
        return bond;
    }

    public String getFlaw() {
        return flaw;
    }

    //setters
    public void setSkillProficiency(List<Skill> skillProficiency) {
        this.skillProficiency = skillProficiency;
    }

    public void setBackgroundStartingEquipment(List<Equipment> backgroundStartingEquipment) {
        this.backgroundStartingEquipment = backgroundStartingEquipment;
    }

    public void setProficiencies(List<Proficiency> proficiencies) {
        this.proficiencies = proficiencies;
    }

    public void setBackgroundFeature(String backgroundFeature) {
        this.backgroundFeature = backgroundFeature;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setPersonalityTrait(String personalityTrait) {
        this.personalityTrait = personalityTrait;
    }

    public void setIdeal(String ideal) {
        this.ideal = ideal;
    }

    public void setBond(String bond) {
        this.bond = bond;
    }

    public void setFlaw(String flaw) {
        this.flaw = flaw;
    }
}
