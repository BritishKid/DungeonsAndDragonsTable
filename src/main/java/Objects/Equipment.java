package Objects;

import java.util.List;

public class Equipment {

    //todo generic this and have weapon and armour inherit as their own type
    private String name;
    private String type;
    private int weight; //todo change from int to more viable data type
    private int amount = 0;
    private int value; //values are in gp, may need to change out of int for smaller values or String including coin type
    private String information;

    //getters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public int getAmount() {
        return amount;
    }

    public int getValue() {
        return value;
    }

    public String getInformation() {
        return information;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
