import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {

    static Node top = null;

    // PUSH
    static void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    // POP
    static void pop() {
        if (top == null) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Popped: " + top.data);
            top = top.next;
        }
    }

    // PEEK
    static void peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Top: " + top.data);
        }
    }

    // DISPLAY (Full Stack)
    static void display() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }

        Node temp = top;
        System.out.print("Stack: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // number of elements

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            push(value);
        }

        display();   // show full stack
        peek();      
        pop();       
        display();   

        sc.close();
    }
}