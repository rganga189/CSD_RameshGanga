package RpnCalc;

import java.util.Arrays;
import java.util.Stack;

import org.junit.Test;

public class RpnTest {
	
	@Test
	public void calcRPN() throws ArithmeticException,Exception{
		try{
		Stack<String> obj = new Stack<String>();
		obj.push("4 5 +");
		for (String s: obj){
		obj.addAll(Arrays.asList(s.trim().split("[ \t]+")));
		
		double r = Rpn.evalrpn(obj);
		if (!obj.empty()) throw new Exception();
            System.out.println(r);
         }
		}
				
       catch (Exception e) {
    	  System.out.println("Plz enter values");}
		}
	}


