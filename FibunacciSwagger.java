public class FibunacciSwagger {
    public static void main() {
        System.out.print(was(5));
    }
    
    public static int was(int n) {
        if(n <= 2)
            return n;
        return 3 * was(n - 2) + 2 * was(n - 1);
    }
}