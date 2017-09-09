
public class DemoSalesperson {
    public static void main(String[] args) {
        int x;
        Salesperson[] salespeople = new Salesperson[10];
        for (x=0; x<10; ++x){
            salespeople[x] = new Salesperson(9999, 0);
        }
        for (Salesperson salesperson: salespeople){
            System.out.println(salesperson.toString());
        }
    }
}
