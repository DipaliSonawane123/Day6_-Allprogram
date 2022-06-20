/*Write a static function sqrt to compute the square root of a nonnegative number c
given in the input using Newton's method:
- initialize t = c
- replace t with the average of c/t and t
- repeat until desired accuracy reached using condition Math.abs(t - c/t) > epsilon*t
where epsilon = 1e-15;*/
package junitprograms;

import java.util.Scanner;

public class Sqrt {
	 public static void main(String args[]) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter a non-negative number: ");
	    	int c = input.nextInt();
	        input.close();
	    	sqrt(c);
	    }

	    public static void sqrt(int c) {
	        double epsilon = 1e-15;
	        double t = c;
	        double root;
	        while (true) {     
	            root = 0.5 * (t + (c / t));
	     
	            if (Math.abs(root - t) < epsilon)
	                break;
	     
	            t = root;
	        }
	        System.out.println("Root: " + root);
	    }

	}


