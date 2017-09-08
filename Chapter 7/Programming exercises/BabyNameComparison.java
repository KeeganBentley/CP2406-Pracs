import java.util.Scanner;
public class BabyNameComparison {
    public static void main(String[] args) {
        String nameOne, nameTwo, nameThree;
        Scanner input = new Scanner(System.in);

        //Get user input for each of the names
        System.out.println("Enter the first name");
        nameOne = input.nextLine();
        System.out.println("Enter the second name");
        nameTwo = input.nextLine();
        System.out.println("Enter the third name");
        nameThree = input.nextLine();

        //Print all combinations
        System.out.println(nameOne + " " + nameTwo);
        System.out.println(nameOne + " " + nameThree);
        System.out.println(nameTwo + " " + nameThree);
        System.out.println(nameTwo + " " + nameOne);
        System.out.println(nameThree + " " + nameOne);
        System.out.println(nameThree + " " + nameTwo);
    }
}
