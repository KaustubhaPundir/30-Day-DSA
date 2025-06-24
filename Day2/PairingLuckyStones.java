import java.util.*;

public class Main {
    public static int findLuckyStonePairs(int p, int n, int m, int[] stones) {
        int count=0;
        for (int i=0;i<p;i++){
            for (int j=i+1;j<p;j++){
                if(i==p-1){
                    break;
                }
                if(stones[i]%n!=0 && stones[i]%m!=0){
                    break;
                }
                else{
                    if((stones[i]%n==0 || stones[i]%m==0)&&(stones[j]%n==0 || stones[j]%m==0)){
                        count++;
                    }
                }
            }   
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] stones = new int[p];
        for (int i = 0; i < p; i++) {
            stones[i] = sc.nextInt();
        }
        int result = findLuckyStonePairs(p, n, m, stones);
        System.out.println(result);
    }
}
