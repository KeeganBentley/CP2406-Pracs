import javax.swing.JOptionPane;
public class QuartsToGallonsInteractive
{
    public static void main(String[] args) {
        final int QUARTSPERGALLON = 4;
        int quartsRequired;
        String quarts;
        quarts = JOptionPane.showInputDialog("How many Quarts are required?");
        quartsRequired = Integer.parseInt(quarts);
        System.out.println("A job that needs " + quartsRequired + " quarts requires " +
                (quartsRequired / QUARTSPERGALLON) + " gallons plus " + (quartsRequired % QUARTSPERGALLON) + " quarts.");
    }
}
