package Objects;

import java.util.List;

public class PCBackground {

    private List<String> skillProficiency;
    private List<String> toolProficiency;
    private List<Equipment> backgroundStartingEquipment;

    private String feature;
    private String speciality;

    private String personalityTrait;
    private String ideal;
    private String bond;
    private String flaw;

    //getters
    public List<String> getSkillProficiency() {
        return skillProficiency;
    }

    public List<String> getToolProficiency() {
        return toolProficiency;
    }

    public List<Equipment> getBackgroundStartingEquipment() {
        return backgroundStartingEquipment;
    }

    public String getFeature() {
        return feature;
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
    public void setSkillProficiency(List<String> skillProficiency) {
        this.skillProficiency = skillProficiency;
    }

    public void setToolProficiency(List<String> toolProficiency) {
        this.toolProficiency = toolProficiency;
    }

    public void setBackgroundStartingEquipment(List<Equipment> backgroundStartingEquipment) {
        this.backgroundStartingEquipment = backgroundStartingEquipment;
    }

    public void setFeature(String feature) {
        this.feature = feature;
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
