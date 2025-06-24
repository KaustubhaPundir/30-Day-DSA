import java.util.*;

public class Main {
    public static int isMountainValleyPattern(int[] arr) {
        if (arr.length==1){
            return 1;
        }
        else if(arr[0]<arr[1]){
            for (int i=1;i<arr.length;i++){
                 if(i==arr.length-1){
                    break;
                }
                if(i%2==0){
                    if(!(arr[i]<arr[i+1])){
                        return 0;
                    }
                }
                if(i%2!=0){
                    if(!(arr[i]>arr[i+1])){
                        return 0;
                    }
                }
            }
            return 1;
        }
        else if(arr[0]>arr[1]){
             for (int i=1;i<arr.length;i++){
                if(i==arr.length-1){
                    break;
                }
                if(i%2==0){
                    if(!(arr[i]>arr[i+1])){
                        return 0;
                    }
                }
                else if(i%2!=0){
                    if(!(arr[i]<arr[i+1])){
                        return 0;
                    }
                }
            }
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = isMountainValleyPattern(arr);
        System.out.println(result);
    }
}
