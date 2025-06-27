import java.util.*;

public class Main {

    public static List<Integer> getSubarrayBeauty(List<Integer> nums, int k, int x) {
        List<Integer> result = new ArrayList<>();

        // We'll use a fixed-size frequency array for numbers from -50 to -1
        int[] freq = new int[101]; // index 0 → -50, ..., index 50 → 0, index 100 → 50

        for (int i = 0; i < nums.size(); i++) {
            // Add current number to frequency (only count negatives up to -1)
            if (nums.get(i) < 0) {
                freq[nums.get(i) + 50]++;
            }

            // Remove the number that goes out of the window
            if (i >= k) {
                if (nums.get(i - k) < 0) {
                    freq[nums.get(i - k) + 50]--;
                }
            }

            // Start processing when we have a full window
            if (i >= k - 1) {
                int count = 0;
                int beauty = 0;

                // Go through negative values from smallest to largest
                for (int j = 0; j < 50; j++) { // Only negatives
                    count += freq[j];
                    if (count >= x) {
                        beauty = j - 50; // convert back to real number
                        break;
                    }
                }

                result.add(beauty);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt(); // window size
        int x = scanner.nextInt(); // x-th smallest negative
        int n = scanner.nextInt(); // number of elements

        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(scanner.nextInt());
        }

        List<Integer> result = getSubarrayBeauty(nums, k, x);

        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
