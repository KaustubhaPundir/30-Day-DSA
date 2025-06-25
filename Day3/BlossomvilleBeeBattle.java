import java.util.*;

public class Main {
    public static List<Integer> userLogic(int n1, List<Integer> flowers, int n2, List<Integer> herbs) {
        List<Integer> result=new ArrayList<>();
        int flowers_count=0;
        int herbs_count=0;
        for (int i=0;i<n1;i++){
            for (int j=0;j<n1;j++){
                if (flowers.get(i)==flowers.get(j)){
                    flowers_count++;
                }
            }

            for (int j=0;j<n2;j++){
                if (flowers.get(i)==herbs.get(j)){
                    herbs_count++;
                }
            }

            if(flowers_count>herbs_count){
                result.add(flowers.get(i));
            }herbs_count=0;
            flowers_count=0;
        }
        if(result.size()!=0){
            return result;
        }
        else{
            result.add(-1);
            return result;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        List<Integer> flowers = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            flowers.add(sc.nextInt());
        }
        int n2 = sc.nextInt();
        List<Integer> herbs = new ArrayList<>();
        for (int i = 0; i < n2; i++) {
            herbs.add(sc.nextInt());
        }

        List<Integer> result = userLogic(n1, flowers, n2, herbs);

        if (result.size() == 1 && result.get(0) == -1) {
            System.out.println(-1);
        } else {
            for (int i : result) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
