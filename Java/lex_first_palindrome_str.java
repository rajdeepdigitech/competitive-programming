public class lex_first_palindrome_str {
    static char MAX_CHAR = 26;
    static void countFreq(String str, int freq[], int len)
    {
        for (int i = 0; i < len; i++)
        {
            freq[str.charAt(i) - 'a']++;
        }       
    }
    public static void main(String[] args)
    {
        

    }
}