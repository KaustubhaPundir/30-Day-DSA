import java.util.*;

public class Main {
    public static void findStudentPositions(int n, int[] heights, int k, int[] queries, int[] results) {
        // Write your logic here.
        for (int i=0;i<queries.length;i++){
            for(int j=0;j<heights.length;j++){
                if(heights[j]>=queries[i]){
                    results[i]=j;
                    break;
                }
                else if(j==heights.length-1){
                    results[i]=j+1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        int[] queries = new int[k];
        for (int i = 0; i < k; i++) {
            queries[i] = scanner.nextInt();
        }
        int[] results = new int[k];
        findStudentPositions(n, heights, k, queries, results);
        for (int result : results) {
            System.out.println(result);
        }
    }
}
