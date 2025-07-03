import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int result = maxDigitReversalSum(A, B);
        System.out.println(result);
    }
    public static int maxDigitReversalSum(int A, int B) {
        Stack<Integer> stack=new Stack<>();
        int sum=0;
        int number=0;

        for (int i=A;i<=B;i++){
            number=i;
             while (number > 0) {
            stack.push(number % 10);
            number /= 10;
        }

        int reversedNumber = 0;
        int placeValue = 1;
        while (!stack.isEmpty()) {
            reversedNumber += stack.pop() * placeValue;
            placeValue *= 10;
        }
            if(i>=reversedNumber){
                sum=sum+i;
            }
            else{
                sum=sum+reversedNumber;
            }
            reversedNumber=0;
        }
        return sum;
    }
}
