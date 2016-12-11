package RpnDemo;

public class Operand implements Token{
	
	Double value;

    Operand(Double val) {
	value = val;
    }

    @Override
    public Stack execute(Stack stack) {
	stack.push(value);
	return stack;
    }

}
