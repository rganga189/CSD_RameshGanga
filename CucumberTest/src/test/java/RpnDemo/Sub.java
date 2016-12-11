package RpnDemo;

public class Sub implements Token{
	
	@Override
    public Stack execute(Stack stack) {
	if (stack != null) {
	    Double num1 = stack.pop();
	    Double num0 = stack.pop();
	    stack.push(num0 - num1);
	}
	return stack;
    }

}
