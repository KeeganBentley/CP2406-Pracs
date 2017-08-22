import javax.swing.JOptionPane;
public class Eggs {
    public static void main(String[] args) {
        double DOZEN_PRICE = 3.25, INDIVIDUAL_PRICE = 0.45;
        int eggsOrdered, numOfDozen, numOfSingle;
        String numberOfEggs;
        numberOfEggs = JOptionPane.showInputDialog("How many eggs do you want to order?");
        eggsOrdered = Integer.parseInt(numberOfEggs);
        numOfDozen = eggsOrdered / 12;
        numOfSingle = eggsOrdered % 12;
        JOptionPane.showMessageDialog(null, "You ordered " + eggsOrdered + " eggs. That's "
        + numOfDozen + " dozen at $" + DOZEN_PRICE + " per dozen and " + numOfSingle + " loose eggs at " +
                (INDIVIDUAL_PRICE * 100) + " cents each for a total of $" + ((numOfDozen * DOZEN_PRICE) +
                (numOfSingle * INDIVIDUAL_PRICE)));
    }
}
