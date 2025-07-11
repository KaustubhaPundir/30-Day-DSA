import java.util.*;

public class Main {
    public static List<int[]> x_power_y_pairs(int n) {
        // Write your logic here.
        // Return a list of int arrays [X, Y] where X^Y equals n
        List<int[]> list=new ArrayList<>();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if((int)(Math.pow(i,j))>n){
                    break;
                }
                if((int)(Math.pow(i,j))==n){
                    list.add(new int[]{i,j});
                }
            }

        }
        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        // Call the user logic function
        List<int[]> pairs = x_power_y_pairs(n);
        
        // Output the count of valid pairs
        System.out.println(pairs.size());
        
        // Output each pair
        for (int[] pair : pairs) {
            System.out.println(pair[0] + " " + pair[1]);
        }
    }
}
