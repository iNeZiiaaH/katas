import java.util.Arrays;

public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {

        String cleanedStr1 = str1.replaceAll("\\s", "").toLowerCase();
        String cleanedStr2 = str2.replaceAll("\\s", "").toLowerCase();

        char[] chars1 = cleanedStr1.toCharArray();
        char[] chars2 = cleanedStr2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("listen", "silent"));
        System.out.println(areAnagrams("triangle", "integral"));
        System.out.println(areAnagrams("apple", "pale"));
    }
}
