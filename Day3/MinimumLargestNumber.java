import java.util.*;

public class Main {
    // Placeholder function for user logic
    public static int findLargestNumber(List<Integer> arr) {
        int []smallest={arr.get(0),Integer.MAX_VALUE};
        for (int i=0;i<arr.size();i++){
            if (smallest[0]>arr.get(i)){
                smallest[0]=arr.get(i);
            }
        }
        
        for(int i=0;i<arr.size();i++){
            if (smallest[1]>arr.get(i) && arr.get(i)>smallest[0]){
                smallest[1]=arr.get(i);
            }
        }
        if (smallest[1] == Integer.MAX_VALUE) {
            smallest[1] = smallest[0];
        }
        if (smallest[0]*10+smallest[1]>smallest[1]*10+smallest[0]){
            return smallest[0]*10+smallest[1];
        }
        else{
            return smallest[1]*10+smallest[0];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        // Call user logic function and print the output
        int result = findLargestNumber(arr);
        System.out.println(result);
    }
}
