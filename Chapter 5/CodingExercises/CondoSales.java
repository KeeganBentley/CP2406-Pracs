import java.util.Scanner;
public class CondoSales {
    public static void main(String[] args)
    {
        final int LAKE_VIEW = 210000;
        final int PARK_VIEW = 150000;
        final int GOLF_VIEW = 170000;
        int userInput, condoPrice;
        Scanner input = new Scanner(System.in);

        System.out.println("Choose a view\n1 - Park View\n2 - Golf Course View\n3 - Lake View");
        userInput = input.nextInt();
        switch(userInput){
            case 1:
                condoPrice = PARK_VIEW;
                break;
            case 2:
                condoPrice = GOLF_VIEW;
                break;
            case 3:
                condoPrice = LAKE_VIEW;
                break;
            default:
                condoPrice = 0;
        }
        System.out.println("The price of your choice of condo is $" + condoPrice);
    }
}
