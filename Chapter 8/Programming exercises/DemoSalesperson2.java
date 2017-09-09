
public class DemoSalesperson2 {
    public static void main(String[] args) {
        final int ID_START=111;
        final int ANNUAL_SALE_START=25000;
        final int SALES_INCREMENT=5000;
        int x, sale, id;
        Salesperson[] salespeople = new Salesperson[10];
        sale = ANNUAL_SALE_START;
        id = ID_START;
        for (x=0; x<10; ++x){
            salespeople[x] = new Salesperson(id, sale);
            id++;
            sale += SALES_INCREMENT;
        }
        for (Salesperson salesperson: salespeople){
            System.out.println(salesperson.toString());
        }
    }
}
