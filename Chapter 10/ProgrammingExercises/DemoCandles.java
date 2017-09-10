public class DemoCandles {
    public static void main(String[] args) {
        Candle a = new Candle("Blue", 4.3, 5);
        ScentedCandle b = new ScentedCandle("Red", 2.3, 6, "lavender");
        System.out.println("a is: " + a.getColour() + " and is " + a.getHeight() + " inches tall.\nIt costs $" +
        a.getPrice());
        System.out.println("b is: " + b.getColour() + " and is " + b.getHeight() + " inches tall.\nIt costs $" +
                b.getPrice() + " and has a " + b.getScent() + " scent.");
        a.setColour("green");
        a.setHeight(10.5);
        b.setColour("purple");
        b.setScent("purple drank");
        b.setHeight(5.6);
        System.out.println("a is: " + a.getColour() + " and is " + a.getHeight() + " inches tall.\nIt costs $" +
                a.getPrice());
        System.out.println("b is: " + b.getColour() + " and is " + b.getHeight() + " inches tall.\nIt costs $" +
                b.getPrice() + " and has a " + b.getScent() + " scent.");
    }
}
