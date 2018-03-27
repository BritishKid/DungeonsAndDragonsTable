package Objects;

public class Equipment {

    private String name;
    private String type;
    private int weight; //todo change from int to more viable data type
    private int amount;
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

    public void setInformation(String information) {
        this.information = information;
    }
}
