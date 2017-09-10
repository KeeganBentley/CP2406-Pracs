public class MetamorphicRock extends Rock{
    protected String description;

    MetamorphicRock(int numSamples, double weight){
        super(numSamples, weight);
        this.description = "Rock that was once one form of rock but has changed to another under the influence of " +
                "heat, pressure, or some other agent without passing through a liquid phase";
    }
}
