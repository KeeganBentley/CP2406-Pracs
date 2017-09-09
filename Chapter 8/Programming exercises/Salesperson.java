public class Salesperson {
    // Attribute declarations
    private int idNum;
    private double annualSales;

    // Constructor
    Salesperson(int idNum, double annualSales){
        this.idNum = idNum;
        this.annualSales = annualSales;
    }

    //Methods
    public double getAnnualSales() {
        return this.annualSales;
    }
    public int getIdNum() {
        return this.idNum;
    }
    public void setAnnualSales(double annualSales) {
        this.annualSales = annualSales;
    }
    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }
    public String toString(){
        return "Id: " + this.idNum + ", Annual Sales: " + this.annualSales;
    }
}
