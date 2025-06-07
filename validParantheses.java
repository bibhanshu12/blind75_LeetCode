import java.util.Scanner;
import java.util.Stack;

//use Stack to count the parantheses;
public class validParantheses{

        public static boolean validate(String s){
                Stack<Character> st= new Stack<>();

                for(int i=0;i<s.length();i++){
                    if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                        st.push(s.charAt(i));
                    }else{
                        if(!st.empty() && (st.peek()=='(' && s.charAt(i)==')' || st.peek()=='{' && s.charAt(i)=='}' || st.peek()=='[' && s.charAt(i)==']' ) ){
                            st.pop();
                        }else{
                            return false;
                        }
                    }

                }

            return st.empty();
        }
            public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        String s= sc.nextLine();

        System.out.println("The paranthesis is validated as: "+validate(s));

    }
}
