import java.util.*;

public class Main {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isPerfectSquare(int num) {
        int sqrt = (int)Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    public static void transformMatrix(int[][] matrix, int n, int[] results) {
        boolean[][] toMark = new boolean[n][n]; // stores perfect square positions

        // Step 1: Identify all perfect square positions
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isPerfectSquare(matrix[i][j])) {
                    toMark[i][j] = true;
                }
            }
        }

        // Step 2: Mark rows and columns of perfect squares with -1
        boolean[] markRow = new boolean[n];
        boolean[] markCol = new boolean[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (toMark[i][j]) {
                    markRow[i] = true;
                    markCol[j] = true;
                }
            }
        }

        // Step 3: Apply the -1 marking
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (markRow[i] || markCol[j]) {
                    matrix[i][j] = -1;
                }
            }
        }

        // Step 4: Now replace remaining primes with 0 and count them
        results[1] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != -1 && isPrime(matrix[i][j])) {
                    matrix[i][j] = 0;
                    results[1]++;
                }
            }
        }

        // Step 5: Count rows fully -1
        results[0] = 0;
        for (int i = 0; i < n; i++) {
            boolean fullRow = true;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != -1) {
                    fullRow = false;
                    break;
                }
            }
            if (fullRow) {
                results[0]++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = scanner.nextInt();

        int[] results = new int[2];
        transformMatrix(matrix, n, results);

        System.out.println(results[0] + " " + results[1]);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
