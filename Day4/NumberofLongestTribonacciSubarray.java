import java.util.*;

public class Main {
    static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int maxVal = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            maxVal = Math.max(maxVal, arr[i]);
        }

        System.out.println(countTribonacciSubarrays(arr, maxVal));
    }

    public static long countTribonacciSubarrays(int[] arr, int maxVal) {
        // Step 1: Generate Tribonacci numbers up to maxVal
        Set<Integer> tribSet = new HashSet<>();
        int a = 0, b = 1, c = 1;
        tribSet.add(a);
        tribSet.add(b);
        tribSet.add(c);

        while (true) {
            int next = a + b + c;
            if (next > maxVal) break;
            tribSet.add(next);
            a = b;
            b = c;
            c = next;
        }

        // Step 2: Traverse array and count subarrays
        long total = 0;
        int length = 0;

        for (int i = 0; i < arr.length; i++) {
            if (tribSet.contains(arr[i])) {
                length++;
            } else {
                total = (total + ((long) length * (length + 1) / 2) % MOD) % MOD;
                length = 0;
            }
        }

        // Final segment
        if (length > 0) {
            total = (total + ((long) length * (length + 1) / 2) % MOD) % MOD;
        }

        return total;
    }
}
