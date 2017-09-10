public class SedimentaryRock extends Rock{
    protected String description;

    SedimentaryRock(int numSamples, double weight){
        super(numSamples, weight);
        this.setDescription("Rock that has formed through the deposition and solidification of sediment, especially " +
                "sediment transported by water, ice and wind. ");
    }
}
