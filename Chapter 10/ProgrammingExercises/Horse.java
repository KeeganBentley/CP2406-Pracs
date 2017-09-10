public class Horse {
    protected String name;
    protected String colour;
    protected int birthYear;

    //Constructor
    Horse(String name, String colour, int year){
        this.name = name;
        this.colour = colour;
        this.birthYear = year;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
