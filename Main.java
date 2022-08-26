import java.util.Random; 
import java.util.Date;
import java.util.Arrays;

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
            int minIndex = i;
            for(int j = i + 1; j < a.length; j++) {
                if(a[minIndex] > a[j])
                    minIndex = j;
            }
            swap(a, minIndex, i);
        }
        // printArray(a);
    }
    
    public static void bubbleSort(int[] a) {
        for(int i = 0; i < a.length - 1; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] > a[j])
                    swap(a,j, i);
            }
        }
        // printArray(a);
    }
    
    public static void insertionSort(int[] a) {
        for(int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i;
            while(j > 0 && a[j - 1] > temp) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = temp;
        }
        // printArray(a);
    }
    
    public static void benchmark(int cycles) {
        for(int i = 1; i <= cycles; i++) {
            int elements = (int) Math.pow(2, i);
            int[] blueprint = fillArray(new int[elements]);
            {
                int[] arr = cloneArray(blueprint);
                double preCalc = System.currentTimeMillis();
                bubbleSort(arr);
                System.out.println("BubbleSort: " + elements + " Elements took " + (System.currentTimeMillis() - preCalc) + "ms.");
            }
            
            {
                int[] arr = cloneArray(blueprint);
                double preCalc = System.currentTimeMillis();
                selectionSort(arr);
                System.out.println("SelectionSort: " + elements + " Elements took " + (System.currentTimeMillis() - preCalc) + "ms.");    
            }
            
            {
                int[] arr = cloneArray(blueprint);
                double preCalc = System.currentTimeMillis();
                insertionSort(arr);
                System.out.println("InsertionSort: " + elements + " Elements took " + (System.currentTimeMillis() - preCalc) + "ms.");
            }
            
            {
                int[] arr = cloneArray(blueprint);
                double preCalc = System.currentTimeMillis();
                Arrays.sort(arr);
                System.out.println("QuickSort: " + elements + " Elements took " + (System.currentTimeMillis() - preCalc) + "ms.");
            }
        }
    }
    
    private static int[] fillArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt();
        }
        return arr;
    } 
}
