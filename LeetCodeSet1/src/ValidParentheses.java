import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		System.out.println(new ValidParentheses().isValid(")"));
	}

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}
			if (ch == ')' && (stack.isEmpty() || '(' != stack.pop())) {
				return false;
			}
			if (ch == '}' && (stack.isEmpty() || '{' != stack.pop())) {
				return false;
			}
			if (ch == ']' && (stack.isEmpty() || '[' != stack.pop())) {
				return false;
			}
		}
		return stack.isEmpty();
	}
}
