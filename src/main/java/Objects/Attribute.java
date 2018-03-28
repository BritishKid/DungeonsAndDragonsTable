package Objects;


/**
 * Defines an attribute
 * i.e. Dexterity, Strength
 */
public class Attribute {

    private String attributeName;
    private String attributeDescription;
    private int attributeValue;
    private int attributeModifier;


    //Getters
    public String getAttributeName() {
        return attributeName;
    }
    public String getAttributeDescription() {
        return attributeDescription;
    }
    public int getAttributeValue() {
        return attributeValue;
    }
    public int getAttributeModifier() {
        return attributeModifier;
    }

    //Setters
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }
    public void setAttributeDescription(String attributeDescription) {
        this.attributeDescription = attributeDescription;
    }
    public void setAttributeValue(int attributeValue) {
        this.attributeValue = attributeValue;
    }
    public void setAttributeModifier(int attributeModifier) {
        this.attributeModifier = attributeModifier;
    }
}
