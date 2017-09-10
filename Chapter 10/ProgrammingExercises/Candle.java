public class Candle {
    protected String colour;
    protected double height;
    protected double price;

    Candle(String colour, double height, double price){
        this.colour = colour;
        this.height = height;
        this.price = price;
    }

    public String getColour() {
        return colour;
    }
    public double getHeight() {
        return height;
    }
    public double getPrice() {
        return price;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setHeight(double height) {
        this.height = height;
        this.price = this.height * 2;
    }
}
