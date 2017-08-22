public class NumbersDemo {
    public static void main(String[] args) {
        int numOne = 7;
        int numTwo = 15;
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
