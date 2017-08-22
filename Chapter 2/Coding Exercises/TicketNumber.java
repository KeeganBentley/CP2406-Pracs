import javax.swing.JOptionPane;
public class TicketNumber {
    public static void main(String[] args) {
        int ticketNumber, droppedDigit;
        String ticketInput;
        boolean result;
        ticketInput = JOptionPane.showInputDialog("Enter the ticket number.");
        ticketNumber = Integer.parseInt(ticketInput.substring(0,5));
        droppedDigit = Integer.parseInt(ticketInput.substring(5));
        result = ((ticketNumber % 7) == droppedDigit);
        // testing System.out.println(droppedDigit + "    " + ticketNumber);
        JOptionPane.showMessageDialog(null, result);
    }
}
