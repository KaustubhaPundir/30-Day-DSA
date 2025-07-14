import java.util.*;

class Node {
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}

class LinkedList {
    Node head;
    void reverse() {
        Node prev = null, current = head, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    List<Integer> printList() {
        Node temp = head;
        List<Integer> result = new ArrayList<>();
        while (temp != null) {
            result.add(temp.data);
            temp = temp.next;
        }
        return result;
    }
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
}

public class Main {
    public static List<Integer> reverseLinkedList(List<Integer> arr) {
        LinkedList ll = new LinkedList();
        for (int num : arr) {
            ll.push(num);
        }
        return ll.printList();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        List<Integer> result = reverseLinkedList(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
