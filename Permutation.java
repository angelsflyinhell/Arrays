import java.util.Scanner;

public class Permutation {
    static int maxIndex;
    static char[] feld;
    static String s;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gib den String ein");
        s = input.nextLine();
        maxIndex = s.length();
        feld = s.toCharArray();
        perm(feld, maxIndex);
    }

    static void perm(char[] a, int endIndex) {
        if (endIndex == 0) {
            ausgabe(a);
        } else {
            perm(a, endIndex - 1);
            for (int i = 0; i < endIndex - 1; i++) {
                vertausche(a, i, endIndex - 1);
                perm(a, endIndex - 1);
                vertausche(a, i, endIndex - 1);
            }
        }
    }

    static void vertausche(char[] a, int i, int j) {
        char ablage = a[i];
        a[i] = a[j];
        a[j] = ablage;
    }

    static void ausgabe(char[] a) {
        for (int i = 0; i <= maxIndex - 1; i++) {
            System.out.print(a[i]);
        }
        System.out.print("\n");
    }
}