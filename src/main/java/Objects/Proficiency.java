package Objects;

/**
 * Defines a Proficiency
 * i.e. language, weapon or armor proficiency
 * NOT SKILLS
 */
public class Proficiency {
    private String name;
    private String type; // TODO: look at having this as an enum/array check
    private String description;

    //getters

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
    public String getDescription() {
        return description;
    }

    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
