public class Poem {
    protected String poemName;
    protected int numLines;

    public Poem(String name, int num){
        this.poemName = name;
        this.numLines = num;
    }

    public int getNumLines() {
        return numLines;
    }
    public String getPoemName() {
        return poemName;
    }
}
