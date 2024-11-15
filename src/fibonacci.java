public class fibonacci {

    public static int main(int n) {
        if (n <= 1) return n;
        return main(n - 1) + main(n - 2);
    }
    
    public static void main(String[] args) {
        System.out.println(main(10));  
    }

}
