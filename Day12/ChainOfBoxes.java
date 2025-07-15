import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<n;i++){
            stack.push(sc.nextInt());
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
        
        

    }
}
