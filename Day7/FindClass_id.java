import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] A) {
        int req_class=0;
        for(int i=0;i<A.length;i++){
            if(i==0){
                if(A[i+1]<=A[i]){
                    req_class=i;
                    break;
                }
            }
            else if(i==A.length-1){
                if(A[i-1]<=A[i]){
                    req_class=i;
                    break;
                }
            }
            else{
                if(A[i-1]<=A[i] && A[i+1]<=A[i]){
                    req_class=i;
                    break;
                }
            }
        }
        return req_class;
    }
}
