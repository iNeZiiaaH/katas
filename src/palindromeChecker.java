public class palindromeChecker {
    public static boolean isPalindrome(String str) {
        try {
            String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            String reversed = new StringBuilder(cleaned).reverse().toString();

            return cleaned.equals(reversed);
        } catch (Exception e) {

            System.err.println("Une erreur s'est produite lors de la vérification du palindrome : " + e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        String test1 = "A man, a plan, a canal, Panama";
        String test2 = "Racecar";
        String test3 = "Hello, World!";
        String test4 = "La programmation est amusante";
        String test5 = "À révéler mon nom, mon nom relèvera ";
        String test6 = "Noël a trop par rapport à Léon";
        String test7 = "Madam, in Eden, I’m Adam";

        System.out.println(isPalindrome(test1));
        System.out.println(isPalindrome(test2));
        System.out.println(isPalindrome(test3));
        System.out.println(isPalindrome(test4));
        System.out.println(isPalindrome(test5));
        System.out.println(isPalindrome(test6));
        System.out.println(isPalindrome(test7));
    }
}
