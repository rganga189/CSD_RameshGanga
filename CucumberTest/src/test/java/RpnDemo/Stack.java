package RpnDemo;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class Stack extends ArrayDeque<Double>{
	
	@Override
    public void push(Double v) {
	System.out.println(toString() + "<-" + v);
	super.push(v);
    }

    @Override
    public Double pop() {
	Double v = super.pop();
	System.out.println(toString() + "->" + v);
	return v;
    }

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("[");
	for (Double v: this) {
	    builder.append(v);
	    builder.append(" ");
	}
	builder.append("]");

	return builder.toString();
    }


}
