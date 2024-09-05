public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String origin = String.valueOf(x);
        String reversed = "";
        for (int i = 0; i < origin.length(); i++) {
            reversed = origin.charAt(i) + reversed;
        }

        return origin.equals(reversed);
    }
}
