import java.util.*;

public class Main {
    public static int next_good_number(int x) {
        boolean good=true;
        int tester=0;
        while (true){
            x++;
            tester=x;
            while(tester!=0){
                if((tester%10)%2==0){
                    good=false;
                } 
                tester=(int)(tester/10);
            }
            if(good){
                return x;
            }
            good=true;
        }
        // return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] results = new int[T];

        for (int i = 0; i < T; i++) {
            int x = scanner.nextInt();
            results[i] = next_good_number(x);
        }

        for (int res : results) {
            System.out.println(res);
        }
    }
}
