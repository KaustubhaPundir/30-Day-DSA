import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        int result = user_logic(n, arr, b);
        System.out.println(result);
    }

   public static int user_logic(int n, int[] arr, int[] b) {
    Arrays.sort(arr);
    Arrays.sort(b);

    int intentA = 0;
    int intentB = 0;

    for (int i = 0; i < n; i++) {
        intentA += countLessThanOrEqual(b, arr[i]);
        intentB += countLessThanOrEqual(arr, b[i]);
    }

    return Math.max(intentA, intentB);
}

// Binary search to count how many elements in sorted array are ≤ key
private static int countLessThanOrEqual(int[] sortedArr, int key) {
    int low = 0, high = sortedArr.length - 1;
    while (low <= high) {
        int mid = (low + high) / 2;
        if (sortedArr[mid] <= key) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return low; // 'low' is the number of elements ≤ key
}

}
