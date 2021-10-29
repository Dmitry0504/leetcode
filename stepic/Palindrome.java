package stepic;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("abcd"));
    }

        public static boolean isPalindrome(String text) {
        String string = text.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder builder = new StringBuilder(string);
        return builder.reverse().toString().equalsIgnoreCase(string);
    }
}
