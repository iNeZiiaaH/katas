public class SommeDesPairs {

    public static int sommeDesPairs(int[] nombres) {
        int somme = 0;
        for (int nombre : nombres) {
            if (nombre % 2 == 0) { 
                somme += nombre;
            }
        }
        return somme;
    }

    public static void main(String[] args) {
        int[] tableau1 = {1, 2, 3, 4, 5, 6};
        System.out.println(sommeDesPairs(tableau1)); 

        int[] tableau2 = {7, 8, 10, 13};
        System.out.println(sommeDesPairs(tableau2)); 

        int[] tableau3 = {};
        System.out.println(sommeDesPairs(tableau3)); 
    }
}
