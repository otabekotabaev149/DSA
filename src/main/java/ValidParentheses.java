import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid2("[]{(){{}}{}}"));
    }

    // using s.contains() method is slower
    private static boolean isValid2(String s) {
        while(s.contains("{}") || s.contains("()") || s.contains("[]")){
            if(s.contains("{}")) s = s.replace("{}", "");
            else if(s.contains("()")) s = s.replace("()", "");
            else if(s.contains("[]")) s = s.replace("[]", "");
        }
        if(s.length() == 0) return true;
        return false;
    }

    // using Stack is better (faster) !
    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else
            if(c == ')'){
                if(!stack.isEmpty() && stack.peek() == '(') stack.pop();
                else stack.push(c);
            } else
            if(c == '}'){
                if(!stack.isEmpty() && stack.peek() == '{') stack.pop();
                else stack.push(c);
            } else
            if(c == ']'){
                if(!stack.isEmpty() && stack.peek() == '[') stack.pop();
                else stack.push(c);
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}
