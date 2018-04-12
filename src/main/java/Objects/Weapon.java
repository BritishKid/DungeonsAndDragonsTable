package Objects;

import java.util.List;

public class Weapon extends Equipment  {

    private List<String> properties; //todo maybe create properites object instead of String to contain information on each property type
    private String damage;
    private String damageType;
    private boolean magical;

    //getters

    public List<String> getProperties() {
        return properties;
    }

    public String getDamage() {
        return damage;
    }

    public String getDamageType() {
        return damageType;
    }

    public boolean isMagical() {
        return magical;
    }

    //setters

    public void setProperties(List<String> properties) {
        this.properties = properties;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    public void setMagical(boolean magical) {
        this.magical = magical;
    }
}