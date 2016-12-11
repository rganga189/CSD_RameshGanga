package RpnCalc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Rpn {
	
	public static double evalrpn(Stack<String> tks) throws ArithmeticException,Exception {
	    String tk = tks.pop();	    
	    double x,y;
	    try {
	    	 x = Double.parseDouble(tk);
	    	}
	    catch (Exception e) {	    	
	      y = evalrpn(tks);
	      x = evalrpn(tks);
	      if(tk.matches("[a-zA-Z]+")){
      		System.out.println("Please enter digits:::");
      		throw new ArithmeticException();
      	}
	      if      (tk.equals("+"))  x += y;
	      else if (tk.equals("-"))  x -= y;
	      else if (tk.equals("*"))  x *= y;
	      else if (tk.equals("/"))  x /= y;	      
	      else throw new Exception();
	    }
	    return x;
	  }

}
