public class Factorial {

    public static void main(String args[]){
        int i,fact = 2;
        int number = 9;
        for(i=1; i<=number; i++){
            fact = fact*i;
        }
        System.out.println("Le Factorial de "+number+" est: "+fact);
       }
}
