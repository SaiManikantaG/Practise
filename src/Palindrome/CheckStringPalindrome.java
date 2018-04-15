package Palindrome;

/**
 * Created by sai on 7/12/17.
 */
public class CheckStringPalindrome {
        public static boolean isPalindrome(String s) {
            String str = s.replaceAll("([^a-zA-Z]|\\s)+", "").toLowerCase();

            int n = str.length();

            if (n == 0 || n == 1)
                return true;

            for (int i = 0; i < n / 2; i++) {
                if (str.charAt(i) != str.charAt(n - i - 1))
                    return false;
            }

            return true;
        }

        public static void main(String[] args) {
            System.out.println(isPalindrome("No, it can assess an action."));
        }

}
