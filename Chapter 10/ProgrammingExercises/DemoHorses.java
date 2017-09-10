public class DemoHorses {
    public static void main(String[] args) {
        Horse fido = new Horse("fido", "brown", 2002);
        System.out.println("Name: " + fido.getName() + " Colour: " + fido.getColour() + " Birth year: "
        + fido.getBirthYear());
        RaceHorse luckyStar = new RaceHorse("Lucky Star", "Beige", 2004, 10);
        System.out.println(luckyStar.getName() + " is " + luckyStar.getColour() + ", was born in " +
        luckyStar.getBirthYear() + " and has competed in " + luckyStar.getNumRaces() + " races.");
    }
}
