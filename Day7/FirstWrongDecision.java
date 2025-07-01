import java.util.Scanner;

public class Main {
    public static int FirstWrongDecision(String s) {
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='W'){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(FirstWrongDecision(str));
    }
}
