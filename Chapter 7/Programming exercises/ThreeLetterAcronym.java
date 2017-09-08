import java.util.Scanner;

public class ThreeLetterAcronym {
    public static void main(String[] args) {
        String userWords, newWord, acronym="";
        String[] words = new String[3];
        int x, y=0, length, lastSpace = -1;
        char a;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter three words to be converted to an acronym >>>");
        userWords = in.nextLine();
        length = userWords.length();

        for(x = 0; x < length; ++x)
        {
            if (y==2){
                break;
            }
            if(Character.isWhitespace(userWords.charAt(x)))
            {
                newWord = userWords.substring(lastSpace + 1, x);
                words[y] = newWord;
                ++y;
                lastSpace = x;
            }
        }
        newWord = userWords.substring(lastSpace + 1, length);
        words[y] = newWord;

        for (String word: words){
            a = word.charAt(0);
            a = Character.toUpperCase(a);
            acronym = acronym + a;
        }

        System.out.println(acronym);
    }
}
