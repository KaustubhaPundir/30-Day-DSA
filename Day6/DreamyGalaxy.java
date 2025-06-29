import java.util.Scanner;

public class Main {
    public static int calculateMaxMoons(int n, int m, int[][] moons) {
        /*
        Write your logic here.
        Parameters:
            n (int): Number of suns
            m (int): Number of planets per sun
            moons (2D array of int): A 2D array where each sub-array contains integers 
                                     representing the number of moons for each planet 
                                     around a respective sun
        Returns:
            int: Maximum total number of moons in a solar system
        */
        int max=0;
        int total=0;
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                total=total+moons[i][j];
            }
            if(max<total){
                max=total;
            }
            total=0;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[][] moons = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                moons[i][j] = scanner.nextInt();
            }
        }
        
        int result = calculateMaxMoons(n, m, moons);
        System.out.println(result);
    }
}
