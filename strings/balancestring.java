    import java.util.Stack;
public class balancestring {
  
    public static void main(String[] args) {
        String brac = "{([ ])}";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < brac.length(); i++) {
            char ch = brac.charAt(i);

            // Push opening brackets
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            }
            // Handling closing brackets
            else if (ch == '}' || ch == ']' || ch == ')') {
                if (stack.isEmpty()) {
                    System.out.println("Not Balance");
                    return;
                }
                char top = stack.pop();
                if (!isMatching(top, ch)) {
                    System.out.println("Not Balance");
                    return;
                }
            }
        }

        if (stack.isEmpty())
            System.out.println("Balance");
        else
            System.out.println("Not Balance");
    }

    static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')')
            || (open == '[' && close == ']')
            || (open == '{' && close == '}');
    }
}


