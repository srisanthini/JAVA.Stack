import java.util.*;
public class Main{
    public static boolean isValid(String s){
        Stack<Character>Stack=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch=='('||ch=='{'||ch=='['){
                Stack.push(ch);
            }
            else{
                if(Stack.isEmpty()){
                    return false;
                }
            char top=Stack.pop();
            if((ch==')'&&top!='('||
            ch=='}'&&top!='{'||
            ch==']'&&top!='[')){
                return false;
            }
        }
    }
return Stack.isEmpty();
}
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    
    if (isValid(s)) {
        System.out.println("Valid Paranthesis");
    }
    else{
        System.out.println("Invalid paranthseis");
    }
} 
}