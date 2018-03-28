package Objects;


//todo this will likely need work

/**
 *  Defines a subclass of a character
 *  ie Barbarian, Bard, Fighter
 *  mainClass boolean defines if the class is the starting class for multiclass purposes
 */
public class CharacterClass {

    private PCClass pcClass;
    private int classLevel;
    private boolean mainClass;

    //getters
    public PCClass getPcClass() {
        return pcClass;
    }

    public int getClassLevel() {
        return classLevel;
    }

    public boolean isMainClass() {
        return mainClass;
    }

    //setters
    public void setPcClass(PCClass pcClass) {
        this.pcClass = pcClass;
    }

    public void setClassLevel(int classLevel) {
        this.classLevel = classLevel;
    }

    public void setMainClass(boolean mainClass) {
        this.mainClass = mainClass;
    }
}
