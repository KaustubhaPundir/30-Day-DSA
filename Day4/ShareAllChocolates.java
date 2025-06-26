import java.util.*;

public class Main {
    public static void can_partition_chocolates(int n, int[] chocolates) {
        int total = 0;
        for (int choco : chocolates) {
            total += choco;
        }

        if (total % 2 != 0) {
            System.out.println("NO");
            return;
        }

        int target = total / 2;
        int sum = 0;
        
        // Try to greedily collect values up to target
        Arrays.sort(chocolates); // Optional — smaller values first

        for (int i = n - 1; i >= 0; i--) {
            if (sum + chocolates[i] <= target) {
                sum += chocolates[i];
            }
            if (sum == target) break;
        }

        System.out.println(sum == target ? "YES" : "NO");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] chocolates = new int[n];
        for (int i = 0; i < n; i++) {
            chocolates[i] = scanner.nextInt();
        }
        can_partition_chocolates(n, chocolates);
    }
}
