import java.util.*;

public class Main {
    public static List<Integer> find_tallest(int N, int K, List<Integer> height) {
        List<Integer> result = new ArrayList<>();
        int first=0;
        int tallest=0;
        for (int i=K-1;i<N;i++){
            for(int j=first;j<=i;j++){
                if(height.get(j)>tallest){
                    tallest=height.get(j);
                    
                }
            }
            first++;
            result.add(tallest);
            tallest=0;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        List<Integer> height = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            height.add(sc.nextInt());
        }
        List<Integer> result = find_tallest(N, K, height);
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
