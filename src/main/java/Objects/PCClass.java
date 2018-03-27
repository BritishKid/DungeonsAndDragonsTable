package Objects;

import java.util.List;

public class PCClass {

    private String className;
    private int hitDice;
    private boolean spellCaster;
    private List<String> skillProficiency;
    private List<Equipment> classStartingEquipment;
    private String archetype;
    private List<ClassFeatures> classFeatures;

    //getters
    public String getClassName() {
        return className;
    }

    public int getHitDice() {
        return hitDice;
    }

    public boolean isSpellCaster() {
        return spellCaster;
    }

    public List<String> getSkillProficiency() {
        return skillProficiency;
    }

    public List<Equipment> getClassStartingEquipment() {
        return classStartingEquipment;
    }

    public String getArchetype() {
        return archetype;
    }

    public List<ClassFeatures> getClassFeatures() {
        return classFeatures;
    }

    //setters
    public void setClassName(String className) {
        this.className = className;
    }

    public void setHitDice(int hitDice) {
        this.hitDice = hitDice;
    }

    public void setSpellCaster(boolean spellCaster) {
        this.spellCaster = spellCaster;
    }

    public void setSkillProficiency(List<String> skillProficiency) {
        this.skillProficiency = skillProficiency;
    }

    public void setClassStartingEquipment(List<Equipment> classStartingEquipment) {
        this.classStartingEquipment = classStartingEquipment;
    }

    public void setArchetype(String archetype) {
        this.archetype = archetype;
    }

    public void setClassFeatures(List<ClassFeatures> classFeatures) {
        this.classFeatures = classFeatures;
    }
}
