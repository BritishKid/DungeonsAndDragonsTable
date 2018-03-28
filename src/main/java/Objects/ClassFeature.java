package Objects;


/**
 *  defines a class feature
 *  ie Great Weapons Fighting
 *  levelForFeature defines a level requirement to unlock said feature
 */
public class ClassFeature {

    private String featureName;
    private String featureDescription; //todo maybe create into a generic object
    private int levelForFeature;

    //getters
    public String getFeatureName() {
        return featureName;
    }

    public String getFeatureDescription() {
        return featureDescription;
    }

    public int getLevelForFeature() {
        return levelForFeature;
    }

    //setters
    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public void setFeatureDescription(String featureDescription) {
        this.featureDescription = featureDescription;
    }

    public void setLevelForFeature(int levelForFeature) {
        this.levelForFeature = levelForFeature;
    }
}
