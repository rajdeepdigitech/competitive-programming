public class lex_first_palindrome_str {
    static char MAX_CHAR = 26;
    static void countFreq(String str, int freq[], int len)
    {
        for (int i = 0; i < len; i++)
        {
            freq[str.charAt(i) - 'a']++;
        }       
    }


    // Cases to check whether a palindromic string can be formed or not

    static boolean canMakePalindrome(int freq[], int len)
    {
        int count_odd = 0;

        for (int i = 0; i < MAX_CHAR; i++)
        {
            if (freq[i] % 2 != 0)
            {
                
            }
        }
    }
}