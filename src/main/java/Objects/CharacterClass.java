package Objects;


//todo this will likely need work

/**
 *  Defines a subclass of a character
 *  ie Barbarian, Bard, Fighter
 *  mainClass boolean defines if the class is the starting class for multiclass purposes
 */
public class CharacterClass {

    private String className;
    private int classLevel = 0;
    private boolean mainClass;

    //getters
    public String getClassName() {
        return className;
    }

    public int getClassLevel() {
        return classLevel;
    }

    public boolean isMainClass() {
        return mainClass;
    }

    //setters
    public void setClassName(String className) {
        this.className = className;
    }

    public void setClassLevel(int classLevel) {
        this.classLevel = classLevel;
    }

    public void setMainClass(boolean mainClass) {
        this.mainClass = mainClass;
    }
}