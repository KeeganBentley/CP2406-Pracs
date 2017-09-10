public class IgneousRock extends Rock{
    protected String description;

    public IgneousRock(int numSamples, double weight){
        super(numSamples, weight);
        this.setDescription("Igneous rock is formed through the cooling and solidification of magma or lava");
    }
}
