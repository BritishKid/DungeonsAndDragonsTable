package Objects;

/**
 * Defines a Proficiency
 * i.e. language, weapon or armor proficiency
 */
public class Proficiency {
    private String type; // TODO: look at having this as an enum/array check
    private String description;

    //getters
    public String getType() {
        return type;
    }
    public String getDescription() {
        return description;
    }

    //setters
    public void setType(String type) {
        this.type = type;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
