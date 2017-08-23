import java.util.Scanner;

public class CondoSales2 {
    public static void main(String[] args)
    {
        final int LAKE_VIEW = 210000;
        final int PARK_VIEW = 150000;
        final int GOLF_VIEW = 170000;
        final int GARAGE_PRICE = 5000;
        int userInput, condoPrice;
        boolean valid = false;
        Scanner input = new Scanner(System.in);

        System.out.println("Choose a view\n1 - Park View\n2 - Golf Course View\n3 - Lake View");
        userInput = input.nextInt();
        switch(userInput){
            case 1:
                condoPrice = PARK_VIEW;
                valid = true;
                break;
            case 2:
                condoPrice = GOLF_VIEW;
                valid = true;
                break;
            case 3:
                condoPrice = LAKE_VIEW;
                valid = true;
                break;
            default:
                condoPrice = 0;
        }
        if (valid){
            System.out.println("Parking type\n1 - Garage\n2 - Parking Space");
            userInput = input.nextInt();
            if (userInput == 1){
                condoPrice = condoPrice + GARAGE_PRICE;
            }
            else{
                if(userInput == 2){
                }
                else{
                    System.out.println("Invalid input for parking type.\nAssumed no garage.");
                }
            }
        }
        System.out.println("The price of your choice of condo is $" + condoPrice);
    }
}
