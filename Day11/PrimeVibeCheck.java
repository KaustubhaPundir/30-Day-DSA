import java.util.*;
import java.math.BigInteger;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; next = null; }
}

public class Main {
    public static String userLogic(ListNode head) {
        // Step 1: Build the full number as BigInteger
        BigInteger num = BigInteger.ZERO;
        BigInteger ten = BigInteger.TEN;

        List<ListNode> digits = new ArrayList<>();
        ListNode parser = head;

        // Save digits to list so we can reverse later
        while (parser != null) {
            digits.add(parser);
            parser = parser.next;
        }

        // Form the number
        for (ListNode node : digits) {
            num = num.multiply(ten).add(BigInteger.valueOf(node.val));
        }

        // Step 2: Reverse the number manually (no strings)
        BigInteger rev = BigInteger.ZERO;
        BigInteger digitSum = BigInteger.ZERO;

        BigInteger temp = num;
        while (!temp.equals(BigInteger.ZERO)) {
            BigInteger digit = temp.mod(ten);
            rev = rev.multiply(ten).add(digit);
            digitSum = digitSum.add(digit);
            temp = temp.divide(ten);
        }

        // Step 3: Subtract digit sum
        BigInteger result = rev.subtract(digitSum);

        // Step 4: Check even or odd
        return result.mod(BigInteger.TWO).equals(BigInteger.ZERO) ? "even" : "odd";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ListNode head = null, tail = null;

        for (int i = 0; i < N; i++) {
            int value = sc.nextInt();
            ListNode newNode = new ListNode(value);
            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
        }

        String result = userLogic(head);
        System.out.println(result);
    }
}
