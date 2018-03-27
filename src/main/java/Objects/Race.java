package Objects;

import java.util.List;
import java.util.Map;

public class Race {

    private String raceName;
    private String size;
    private int speed;
    private boolean darkvision;
    private List<Map<String, Integer>> scoreIncrease;
    private List<Map<String, String>> racialTraits;

    //getters
    public String getRaceName() {
        return raceName;
    }

    public String getSize() {
        return size;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isDarkvision() {
        return darkvision;
    }

    public List<Map<String, Integer>> getScoreIncrease() {
        return scoreIncrease;
    }

    public List<Map<String, String>> getRacialTraits() {
        return racialTraits;
    }

    //setters
    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDarkvision(boolean darkvision) {
        this.darkvision = darkvision;
    }

    public void setScoreIncrease(List<Map<String, Integer>> scoreIncrease) {
        this.scoreIncrease = scoreIncrease;
    }

    public void setRacialTraits(List<Map<String, String>> racialTraits) {
        this.racialTraits = racialTraits;
    }
}
