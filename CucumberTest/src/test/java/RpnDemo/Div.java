package RpnDemo;

public class Div implements Token{
	
	@Override
    public Stack execute(Stack stack) {
	if (stack != null) {
	    Double num1 = stack.pop();
	    Double num0 = stack.pop();
	    if (num1 != 0) {
		stack.push(num0 / num1);
	    }
	}
	return stack;
    }

}
