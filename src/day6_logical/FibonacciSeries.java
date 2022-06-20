/*Fibonacci series is a special type of series in which the next term is the sum of the
previous two terms. For example, if 0 and 1 are the two previous terms in a series, then
the next term will be 1(0+1).*/
package day6_logical;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);//taking input from the user
     System.out.print("Enter a number to generate fibonacci series: ");
     int n = sc.nextInt();
     sc.close();
     int a=0;
     int b=1;
     for (int i = 0; i < n; i++){
         System.out.print(a + " ");
         int c = a + b;
         a=b;
         b=c;
}
     }
	}
