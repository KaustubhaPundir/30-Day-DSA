import java.util.Scanner;

public class Main {
    public static void sort_sentence(String s) {
        // Write your logic here.
        // Parameters:
        //     s (String): Input string
        // Returns:
        //     void: Output string according to the given condition
        String[] arr=s.split(" ");
        String[] result = new String[arr.length];
        for (int i=0;i<arr.length;i++){
            int j=Integer.parseInt(Character.toString(arr[i].charAt(arr[i].length()-1)));
            result[j-1]=arr[i];
            
        }
        for (int i=0;i<result.length;i++){
            result[i]=result[i].substring(0, result[i].length()-1);
            
        }
        for (int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        sort_sentence(s);
    }
}
