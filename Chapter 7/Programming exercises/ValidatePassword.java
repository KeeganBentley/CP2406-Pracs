import java.util.Scanner;
public class ValidatePassword {
    public static void main(String[] args) {
        String password;
        int x, upperLetter=0, lowerLetter=0, num=0, length;
        boolean valid = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password with at least 2; Uppercase letters, " +
                "Lowercase letters and numbers.");
        password = input.nextLine();
        length = password.length();
        while(!valid){
            for (x=0; x<length; ++x)
            {
                if (Character.isLowerCase(password.charAt(x))){
                    lowerLetter++;
                }
                if (Character.isUpperCase(password.charAt(x))){
                    upperLetter++;
                }
                if (Character.isDigit(password.charAt(x))){
                    num++;
                }
            }
            if (upperLetter>=2 && lowerLetter>=2 && num>=2){
                valid = true;
                System.out.println("That is a valid password.");
            }
            else
                System.out.println("That password was invalid, try again.");
                password = input.nextLine();
        }
    }
}
