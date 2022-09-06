public class CrackedBruteForce
{
    public static void forceRecursive(int i, int max) {
        if(i == max)
            return;
        System.out.println(i);
        forceRecursive(++i, max);
    }
    
    public static void benchmark(int length) {
            {
                double preCalc = System.currentTimeMillis();
                forceRecursive(0, length);
                System.out.println("Recursion took " + (System.currentTimeMillis() - preCalc) + "ms.");
            }
            {
                double preCalc = System.currentTimeMillis();
                for(int i = 0; i < length; i++) {
                    // cry i guess
                }
                System.out.println("Iteration took " + (System.currentTimeMillis() - preCalc) + "ms.");
            }
    }
}
