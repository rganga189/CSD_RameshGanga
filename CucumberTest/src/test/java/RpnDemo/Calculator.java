package RpnDemo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Calculator {
	
	private static Map<String, Token> tokens;

    {
	tokens = new HashMap<>();
	tokens.put("+", new Add());
	tokens.put("-", new Sub());
	tokens.put("*", new Mul());
	tokens.put("/", new Div());
    }
    
    protected static Token createToken(String s) {
    	System.out.println(s);
    	s.trim().split("[ \t]+");
		
	Token result = tokens.get(s);
	System.out.println(result);
	if (result == null) {
	    result = new Operand(Double.valueOf(s));
	}
	return result;
    }
    
    public static double execute(String input) {
	Stack stack = new Stack();
	
	String[] splits = input.split("\\s");
	
	
	if ( splits != null &&  0 < splits.length) {
	    for (String s : splits) {
	    	
		Token token = createToken(s);
		token.execute(stack);
	    }
	}
	return stack.pop();
    }

    public static void main(String args[]) {
	//StackMachine stackMachine = new StackMachine();
	
	// (1 + 2) * 4 + (4 - 2) == 14
	System.out.println("1 2 + 4 * 4 2 - + = " + execute("1 2 + 4 * 4 2 - +"));
	
	// (1 + 4) * (3 + 7) / 5 == 10
	/*System.out.println("1 4 + 3 7 + * 5 / = " 
			   + execute("1 4 + 3 7 + * 5 /"));
	
	// 10 + 2 == 12
	System.out.println("10 2 + = " 
			   + execute("10 2 +"));
	
	// 10 / 2 == 5
	System.out.println("10 2 / = "
			   + execute("10 2 /"));*/
    }

}
