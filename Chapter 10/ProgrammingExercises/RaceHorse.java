public class RaceHorse extends Horse{
    private int numRaces;

    RaceHorse(String name, String colour, int year, int races){
        super(name, colour, year);
        this.numRaces = races;
    }

    public int getNumRaces() {
        return numRaces;
    }

    public void setNumRaces(int numRaces) {
        this.numRaces = numRaces;
    }
}
