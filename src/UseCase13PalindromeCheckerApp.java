package PalindromeCheckerApp;

public class UseCase13PalindromeCheckerApp {

    // Reverse string method
    public static boolean reverseMethod(String word) {

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        return word.equals(reversed);
    }

    // Two pointer method
    public static boolean twoPointerMethod(String word) {

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "madam";

        // Reverse method timing
        long startTime = System.nanoTime();
        reverseMethod(word);
        long endTime = System.nanoTime();

        long reverseTime = endTime - startTime;

        // Two pointer method timing
        startTime = System.nanoTime();
        twoPointerMethod(word);
        endTime = System.nanoTime();

        long pointerTime = endTime - startTime;

        System.out.println("Reverse Method Time: " + reverseTime + " ns");
        System.out.println("Two Pointer Method Time: " + pointerTime + " ns");
    }
}