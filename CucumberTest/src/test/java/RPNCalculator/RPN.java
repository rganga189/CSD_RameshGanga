package RPNCalculator;

import java.util.*;

public class RPN {

    /**
     * Computes the outcome of a given expression in Reverse Polish Notation
     *
     * @param expr the expression to compute
     */
    public static Double compute(String expr) throws
            ArithmeticException,
            EmptyStackException,
            Exception{
        Stack<Double> stack = new Stack<>();

        System.out.println(expr);
        System.out.println("Input\tOperation\tStack after");

        for (String token : expr.split("\\s+")) {
        	if(token.matches("[a-zA-Z]+")){
        		System.out.println("Please enter digits:::");
        		throw new ArithmeticException();
        	}
            switch (token) {
                case "+":
                    System.out.print("Operate\t\t");
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    System.out.print("Operate\t\t");
                    stack.push(-stack.pop() + stack.pop());
                    break;
                case "*":
                    System.out.print("Operate\t\t");
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    System.out.print("Operate\t\t");
                    double divisor = stack.pop();
                    stack.push(stack.pop() / divisor);
                    break;
                case "^":
                    System.out.print("Operate\t\t");
                    double exponent = stack.pop();
                    stack.push(Math.pow(stack.pop(), exponent));
                    break;
                default:
                	System.out.print("Please enter token here");
                    stack.push(Double.parseDouble(token));
                    break;
            }

            System.out.println(stack);
            
        }
        System.out.println("Final Answer: " + stack.pop());
        return stack.pop();
    }

   
    public static void main(String[] args) {
    	/*try {
			compute("4 5 +");            
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }*/
    }
}
