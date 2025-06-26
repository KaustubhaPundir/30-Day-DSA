import java.util.Scanner;

public class Main {
    public static int countValidPartitions(int[] E, int N) {
        int count = 0;

        for (int len = 1; 2 * len < N; len++) {
            int sumAlpha = 0;
            int sumGamma = 0;
            int sumBeta = 0;

            // Alpha: E[0 to len-1]
            for (int i = 0; i < len; i++) {
                sumAlpha += E[i];
            }

            // Gamma: E[N-len to N-1]
            for (int i = N - len; i < N; i++) {
                sumGamma += E[i];
            }

            // Beta: E[len to N-len-1]
            for (int i = len; i < N - len; i++) {
                sumBeta += E[i];
            }

            if (sumBeta < sumAlpha + sumGamma) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Read the number of plants

        int[] E = new int[N];
        for (int i = 0; i < N; ++i) {
            E[i] = scanner.nextInt();
        }

        int result = countValidPartitions(E, N);

        System.out.println(result);
    }
}
