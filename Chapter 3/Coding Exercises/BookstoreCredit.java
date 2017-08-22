import java.util.Scanner;
public class BookstoreCredit {
    public static void main(String[] args) {
        String name;
        double gpa;
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");
        name = input.nextLine();
        System.out.println("What is your GPA? ");
        gpa = input.nextDouble();
        displayCredit(name, gpa);
    }
    public static void displayCredit(String name, double gpa){
        System.out.println("Hi, " + name + " your gpa is: " + gpa + ". This entitles you to $"
        + (gpa * 10) + " bookstore credit.");
    }
}
