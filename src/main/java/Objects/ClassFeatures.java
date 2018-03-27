package Objects;

public class ClassFeatures {

    private String featureName;
    private String featureDescription;
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
