// Objectif : Écrire une fonction qui trouve l'élément manquant dans un tableau de taille n-1 qui contient tous les entiers de 1 à n sauf un.

public class MissingNumber {

    public static int findMissingNumber(int[] arr, int n) {
        int total = n * (n + 1) / 2;
        int sum = 0;
        
        for (int num : arr) {
            sum += num;
        }
        
        return total - sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        System.out.println(findMissingNumber(arr, 23)); 
    }
}
