import java.util.Arrays;

public class QuickSort {
    public static void main() {
        
    }
    
    public static int[] divide(int[] arr, int start, int end) {
        int[] clone = new int[start + end - 1];
        
        while(start < end) {
            clone[start] = arr[start++];
        }
        return clone;
    }
}