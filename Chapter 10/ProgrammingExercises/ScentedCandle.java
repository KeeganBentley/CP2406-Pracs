public class ScentedCandle extends Candle{
    private String scent;

    ScentedCandle(String colour, double height, double price, String scent){
        super(colour, height, price);
        this.scent = scent;
    }

    public String getScent() {
        return scent;
    }
    public void setScent(String scent) {
        this.scent = scent;
    }

    @Override
    public void setHeight(double height){
        this.height = height;
        this.price = this.height * 3;
    }
}
