public class DemoRocks {
    public static void main(String[] args) {
        Rock a = new Rock(7, 23.4);
        IgneousRock b = new IgneousRock(4, 25.6);
        SedimentaryRock c = new SedimentaryRock(34, 56.5);
        MetamorphicRock d = new MetamorphicRock(2, 5.6);
        System.out.println("" + a.getDescription() + "\nNumber of samples: " + a.getNumSamples() + "\nWeight: "
        + a.getWeight() + "\n");
        System.out.println("" + b.getDescription() + "\nNumber of samples: " + b.getNumSamples() + "\nWeight: "
                + b.getWeight() + "\n");
        System.out.println("" + c.getDescription() + "\nNumber of samples: " + c.getNumSamples() + "\nWeight: "
                + c.getWeight() + "\n");
        System.out.println("" + d.getDescription() + "\nNumber of samples: " + d.getNumSamples() + "\nWeight: "
                + d.getWeight() + "\n");
        //why does the attribute assignment in the subclasses not override superclass
    }
}
