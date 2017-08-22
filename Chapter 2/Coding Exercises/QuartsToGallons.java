public class QuartsToGallons
{
    public static void main(String[] args) {
        final int QUARTSPERGALLON = 4;
        int quartsRequired = 18;
        System.out.println("A job that needs " + quartsRequired + " quarts requires " +
                (quartsRequired / QUARTSPERGALLON) + " gallons plus " + (quartsRequired % QUARTSPERGALLON) + " quarts.");
    }
}
