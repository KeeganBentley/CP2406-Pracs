import java.util.Scanner;
public class NumbersDemo2 {
    public static void main(String[] args) {
        int numOne, numTwo;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number one: ");
        numOne = input.nextInt();
        System.out.print("Enter number two: ");
        numTwo = input.nextInt();
        displayTwiceTheNumber(numOne);
        displayTwiceTheNumber(numTwo);
        displayNumberPlusFive(numOne);
        displayNumberPlusFive(numTwo);
        displayNumberSquared(numOne);
        displayNumberSquared(numTwo);
    }
    public static void displayTwiceTheNumber(int num){
        System.out.println("Twice the number is: " + (num * 2));
    }
    public static void displayNumberPlusFive(int num){
        System.out.println("The number plus five is: " + (num + 5));
    }
    public static void displayNumberSquared(int num){
        System.out.println("The number squared is: " + (num * num));
    }
}
