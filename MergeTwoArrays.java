import java.util.Scanner;

public class MergeTwoArrays {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the total size of array X (including vacant spaces):");
        int sizeX = scanner.nextInt();
        System.out.println("Enter the number of non-vacant elements in array X:");
        int m = scanner.nextInt(); 
        System.out.println("Enter the size of array Y:");
        int n = scanner.nextInt(); 

        int[] X = new int[sizeX];
        int[] Y = new int[n];

        //input from array x
        System.out.println("Enter the elements of array X (use 0 for vacant spaces):");
        for (int i = 0; i < m; i++) { 
            X[i] = scanner.nextInt();
        }

        // Input for elements of array Y
        System.out.println("Enter the elements of array Y:");
        for (int i = 0; i < n; i++) {
            Y[i] = scanner.nextInt();
        }

        moveToEnd(X, m + n);
        merge(X, Y, m, n);

        System.out.println("Merged array:");
        for (int i = 0; i < sizeX; i++) {
            System.out.print(X[i] + " ");
        }
    }

    public static void moveToEnd(int[] X, int size) {
        int j = size - 1;
        for (int i = size - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[j] = X[i];
                if (j != i) {
                    X[i] = 0; 
                }
                j--;
            }
        }
    }

    public static void merge(int[] X, int[] Y, int m, int n) {
        int i = n; 
        int j = 0; 
        int k = 0; 

        while (j < n && i < m + n) {
            if (i >= m + n || Y[j] < X[i]) {
                X[k++] = Y[j++];
            } else {
                X[k++] = X[i++];
            }
        }

    }
}
