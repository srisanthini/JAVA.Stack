import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class StackLL{
    Node top;
    void push(int c){
        Node newNode=new Node(c);
        newNode.next=top;
        top=newNode;
    }
    int pop(){
        if(top==null)
            return-1;
            int x=top.data;
            top=top.next;
            return x;
        }
    int peek(){
        if(top==null)
            return-1;
            return top.data;
        }
    boolean isEmpty(){
        return top==null;
    
    }
}
public class Main{
    static int largestRectangle(int[]arr){
        StackLL stack = new StackLL();
        int maxArea=0;
        int i=0;
        int n=arr.length;
        while(i<n){
            if(stack.isEmpty()||arr[i]>=arr[stack.peek()]){
                stack.push(i);
                i++;
            }else{
                int topIndex=stack.pop();
                int height=arr[topIndex];
                int width;
                if(stack.isEmpty()){
                    width=i;
                    
                }else{
                    width=i-stack.peek()-1;
                }
                int area=height*width;
            maxArea=Math.max(maxArea,area);
            }
        }
        while (!stack.isEmpty()){
            
                int topIndex=stack.pop();
                int height=arr[topIndex];
                int width;
                if(stack.isEmpty()){
                    width=i;
                }else{
                    width=i-stack.peek()-1;
                }
                int area=height*width;
                maxArea=Math.max(maxArea,area);
            }
            return maxArea;
    }
public static void main(String[]args){
    
    int[]arr={2,1,5,6,2,3};
    int result=largestRectangle(arr);
    System.out.println(result);
}
}