package Objects;

public class Armour {
//todo shields are armour type but need to be made sure they add to ac not use for calculation
    private int armourClass;
    private int maximumDexterityModifier;
    private int strengthRequired;
    private boolean stealthDisadvantage;

    //getters
    public int getArmourClass() {
        return armourClass;
    }

    public int getMaximumDexterityModifier() {
        return maximumDexterityModifier;
    }

    public int getStrengthRequired() {
        return strengthRequired;
    }

    public boolean isStealthDisadvantage() {
        return stealthDisadvantage;
    }

    //setters
    public void setArmourClass(int armourClass) {
        this.armourClass = armourClass;
    }

    public void setMaximumDexterityModifier(int maximumDexterityModifier) {
        this.maximumDexterityModifier = maximumDexterityModifier;
    }

    public void setStrengthRequired(int strengthRequired) {
        this.strengthRequired = strengthRequired;
    }

    public void setStealthDisadvantage(boolean stealthDisadvantage) {
        this.stealthDisadvantage = stealthDisadvantage;
    }
}
