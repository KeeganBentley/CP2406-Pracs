public class Rock {
    protected int numSamples;
    protected String description;
    protected double weight;

    Rock(int numSamples, double weight){
        this.numSamples = numSamples;
        this.weight = weight;
        this.description = "Unclassified";
    }

    public double getWeight() {
        return weight;
    }
    public int getNumSamples() {
        return numSamples;
    }
    public String getDescription() {
        return description;
    }
}
