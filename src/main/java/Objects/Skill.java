package Objects;

public class Skill {

    private String skillName;
    private String skillAttribute;
    private boolean skillProficiency = false;
    private boolean skillExpertise = false;
    private int skillOtherModifier = 0; // i.e jack of all trades other bonuses
    private String skillDescription;
    private int skillValue = 0;

    //getters
    public String getSkillName() {
        return skillName;
    }

    public String getSkillAttribute() {
        return skillAttribute;
    }

    public boolean isSkillProficiency() {
        return skillProficiency;
    }

    public boolean isSkillExpertise() {
        return skillExpertise;
    }

    public int getSkillOtherModifier() {
        return skillOtherModifier;
    }

    public String getSkillDescription() {
        return skillDescription;
    }

    public int getSkillValue() {
        return skillValue;
    }

    //setters
    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public void setSkillAttribute(String skillAttribute) {
        this.skillAttribute = skillAttribute;
    }

    public void setSkillProficiency(boolean skillProficiency) {
        this.skillProficiency = skillProficiency;
    }

    public void setSkillExpertise(boolean skillExpertise) {
        this.skillExpertise = skillExpertise;
    }

    public void setSkillOtherModifier(int skillOtherModifier) {
        this.skillOtherModifier = skillOtherModifier;
    }

    public void setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
    }

    public void setSkillvalue(int skillValue){
        this.skillValue = skillValue;
    }

    public void calculateSkillValue(int proficiencyModifier, int attributeModifier) {
        int skillValue = attributeModifier;
        if (isSkillProficiency()) {
            skillValue = skillValue + proficiencyModifier; //if proficient add modifier
        }
        if (isSkillExpertise()) {
            skillValue = skillValue + proficiencyModifier; //if expertise add modifier
        }
        skillValue = skillValue + getSkillOtherModifier(); // add any bonus modifiers

            this.skillValue = skillValue;
    }
}
