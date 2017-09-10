public class IgneousRock extends Rock{
    protected String description;

    IgneousRock(int numSamples, double weight){
        super(numSamples, weight);
        this.description = "Igneous rock is formed through the cooling and solidification of magma or lava";
    }
}
