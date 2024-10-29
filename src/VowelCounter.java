import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir une chaîne :");
        String input = scanner.nextLine().toLowerCase();
        scanner.close();

        if (input.isEmpty()) {
            System.out.println("Erreur : Vous n'avez rien saisi. Veuillez entrer une chaîne valide.");
            return;
        }

        int[] vowelCount = new int[6];
        char[] vowels = {'a', 'e', 'y', 'o', 'i', 'u'};

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            switch (ch) {
                case 'a': vowelCount[0]++; break;
                case 'e': vowelCount[1]++; break;
                case 'y': vowelCount[2]++; break;
                case 'o': vowelCount[3]++; break;
                case 'i': vowelCount[4]++; break;
                case 'u': vowelCount[5]++; break;
                default: break;
            }
        }

        System.out.println("Vous avez saisi : " + input);
        for (int i = 0; i < vowels.length; i++) {
            System.out.println("Lettre " + vowels[i] + " : " + vowelCount[i] + " fois");
        }
    }
}
