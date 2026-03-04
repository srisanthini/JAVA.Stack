import java.util.Scanner;

public class Main {

    static int top = -1;
    static int size = 5;
    static int[] arr = new int[size];

    static void push(int value) {
        if (top == size - 1) {
            System.out.println("Overflow");
            return;
        }
        arr[++top] = value;
    }

    static int pop() {
        if (top == -1) {
            System.out.println("Underflow");
            return -1;
        }
        return arr[top--];
    }

    static int peek() {
        if (top == -1) {
            System.out.println("Empty");
            return -1;
        }
        return arr[top];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            push(value);
        }

        System.out.println( peek());

        System.out.println( pop());

        System.out.println( peek());

        sc.close();
    }
}