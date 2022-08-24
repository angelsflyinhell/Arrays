public class Main {
    public static void main(String[] args) {
        int length = Integer.parseInt(args[0]);
        int[] nArr = new int[length];
        for(int i = 0; i < nArr.length; i++) {
            nArr[i] = nArr.length - i;
        }
        
        printArray(reverse(nArr));
        // System.out.println(searchIndex(nArr, 4));
    }
    
    private static void printArray(int[] array) {
        for(int i : array) {
            System.out.println(i);
        }
    }
    
    public static int searchIndex(int[] a, int value) {
        if(a.length <= value)
            return 0;
        return a[value];
    }
    
    public static int[] swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }
    
    public static int[] reverse(int[] a) {
        for(int i = 0; i < a.length / 2; i++) {
            a = swap(a, i, a.length - i - 1);
        }
        return a;
    }
    
    public static int[] cloneArray(int[] a) {
        int[] clone = new int[a.length];
        for(int i = 0; i < a.length; i++) {
            clone[i] = a[i];
        }
        return clone;
    }
    
    public static int maximum(int[] a) {
        int max = a[0];
        for(int i : a) {
            if(i > max)
                max = i;
        }
        return max;
    }
    
    public static int minimum(int[] a) {
        int min = a[0];
        for(int i : a) {
            if(i < min)
                min = i;
        }
        return min;
    }
    
    public static int minIndex(int[] a) {
        int min = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] < min)
                min = i;
        }
        return min;
    }
    
    public static int maxIndex(int[] a) {
        int max = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] > max)
                max = i;
        }
        return max;
    }
    
    // Selection Sort A7 
    
    public static void selectionSort(int[] a) {
        for(int i = 0; i < a.length - 1; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] > a[j])
                    swap(a,j, i);
            }
        }
        printArray(a);
    }
}
