/**
 * Created by jc374181 on 23/08/17.
 */
import java.util.Scanner;
public class EvenEntryLoop {
    public static void main(String[] args) {
        int userInput;
        final int SENTINAL = 999;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an even number or " + SENTINAL + " to quit... ");
        userInput = input.nextInt();
        while (userInput != SENTINAL){
            if (userInput % 2 != 0){
                System.out.print("That is an odd number.\nPlease enter an even number...");
                userInput = input.nextInt();
            }
            else{
                System.out.println("Good Job!");
                System.out.print("Enter an even number or " + SENTINAL + " to quit... ");
                userInput = input.nextInt();
            }
        }
    }
}
