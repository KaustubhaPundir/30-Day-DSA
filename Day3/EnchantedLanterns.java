import java.util.*;

public class Main {
    public static int calculateWishValuesSum(int N, int[] A) {
        int min=0;
        int max=0;
        int wish=0;
        int temp=0;
        for (int i=0;i<N;i++){
            for(int j=i;j<N;j++){
                if (temp<A[j]){
                    temp=A[j];
                }
                max=temp;
            }
            temp=A[0];
            for(int j=i;j>=0;j--){//min
                if (temp>A[j]){
                    temp=A[j];
                }
                min=temp;
            }
            wish=wish+(max-min);
            temp=0;
        }
        return wish;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int result = calculateWishValuesSum(N, A);
        System.out.println(result);
    }
}
