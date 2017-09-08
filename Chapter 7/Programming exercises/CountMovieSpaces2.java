import java.util.Scanner;
public class CountMovieSpaces2 {
    public static void main(String[] args) {
        String quote;
        int length, x;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your favourite movie quote >>>");
        quote = input.nextLine();
        length = quote.length();
        for (x=0; x<length; ++x)
        {
            if (Character.isWhitespace(quote.charAt(x)))
            {
                 ++count;
            }
        }
        System.out.println("There are " + count + " spaces in your quote.");
    }
}
