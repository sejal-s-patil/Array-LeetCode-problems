class Solution {
    public String longestPalindrome(String s) {
        String palindrome = "";

        for (int i = 0; i < s.length(); i++) {

            // Odd palindrome
            int left = i;
            int right = i;

            while (left >= 0 && right < s.length()) {

                if (s.charAt(left) != s.charAt(right))
                    break;

                if (right - left + 1 > palindrome.length())
                    palindrome = s.substring(left, right + 1);

                left--;
                right++;
            }

            // Even palindrome
            left = i;
            right = i + 1;

            while (left >= 0 && right < s.length()) {

                if (s.charAt(left) != s.charAt(right))
                    break;

                if (right - left + 1 > palindrome.length())
                    palindrome = s.substring(left, right + 1);

                left--;
                right++;
            }
        }

        return palindrome;
    }
}
