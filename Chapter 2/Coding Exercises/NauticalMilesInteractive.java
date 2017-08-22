import javax.swing.JOptionPane;
public class NauticalMilesInteractive
{
    public static void main(String[] args) {
        double KMINNAUTM = 1.852, MINNAUTM = 1.150779;
        /* KMINNAUTM = Kilometers in Nautical Miles, MINNAUTM = Miles in Nautical Miles */
        double nauticalMiles;
        String nM;
        nM = JOptionPane.showInputDialog("How many nautical miles?");
        nauticalMiles = Double.parseDouble(nM);
        System.out.println("There are " + (nauticalMiles * KMINNAUTM) + "km in " + nauticalMiles + " nautical miles.");
        System.out.println("There are " + (nauticalMiles * MINNAUTM) + " miles in " + nauticalMiles + " nautical miles.");
    }
}
