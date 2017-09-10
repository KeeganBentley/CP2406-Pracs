public class DemoPoems {
    public static void main(String[] args) {
        Poem a = new Poem("I Want Cancer for Christmas", 20);
        Couplet b = new Couplet("Whiskey is my Kind of Lullaby");
        Limerick c = new Limerick("New Mexico Song");
        Haiku d = new Haiku("Acid Song");
        System.out.println("Poem a titled: " + a.getPoemName() + ". Lines: " + a.getNumLines());
        System.out.println("Poem b titled: " + b.getPoemName() + ". Lines: " + b.getNumLines());
        System.out.println("Poem c titled: " + c.getPoemName() + ". Lines: " + c.getNumLines());
        System.out.println("Poem d titled: " + d.getPoemName() + ". Lines: " + d.getNumLines());
    }
}
