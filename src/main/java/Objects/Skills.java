package Objects;

public class Skills {

    private String skillName;
    private String skillAttribute;
    private boolean skillProfficiency;
    private boolean skillExpertise;
    private boolean skillOther; // i.e jack of all trades
    private String skillDescription;

    //getters
    public String getSkillName() {
        return skillName;
    }

    public String getSkillAttribute() {
        return skillAttribute;
    }

    public boolean isSkillProfficiency() {
        return skillProfficiency;
    }

    public boolean isSkillExpertise() {
        return skillExpertise;
    }

    public boolean isSkillOther() {
        return skillOther;
    }

    public String getSkillDescription() {
        return skillDescription;
    }

    //setters
    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public void setSkillAttribute(String skillAttribute) {
        this.skillAttribute = skillAttribute;
    }

    public void setSkillProfficiency(boolean skillProfficiency) {
        this.skillProfficiency = skillProfficiency;
    }

    public void setSkillExpertise(boolean skillExpertise) {
        this.skillExpertise = skillExpertise;
    }

    public void setSkillOther(boolean skillOther) {
        this.skillOther = skillOther;
    }

    public void setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
    }
}
