package RPNCalculator;

import static org.junit.Assert.assertEquals;

import java.util.EmptyStackException;

import org.junit.Test;
import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;

public class RpnTest{
	
	
	
	@Test
	public void addOperator() throws
    ArithmeticException,
    EmptyStackException,
    Exception{		
		try {
			System.out.println("SSSSSSSSSS::");
			System.out.println("SSSSSSSSSS::"+RPN.compute("4 7 +"));
			assertEquals(new Double(11.00), RPN.compute("4 7 +"));
			          
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
	}

}
