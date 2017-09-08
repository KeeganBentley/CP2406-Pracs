public class CountMovieSpaces {
    public static void main(String[] args) {
        String quote = "Say what again, I dare you I double dare you Motherfucker.";
        int length = quote.length();
        int x;
        int count = 0;

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
