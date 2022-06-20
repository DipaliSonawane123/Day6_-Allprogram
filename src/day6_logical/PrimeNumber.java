/*Just like the Perfect number, the Prime number is also a special type of number. When
the number is divided greater than 1 and divided by 1 or itself is referred to as the Prime
number. 0 and 1 are not counted as prime numbers. All the even numbers can be
divided by 2, so 2 is the only even prime minister.*/
package day6_logical;

import java.util.Scanner;

public class PrimeNumber {
	 public static void main(String[] args) {
	        int i, number, count = 0;
	      Scanner  sc = new Scanner(System.in);
	      System.out.print(" Please Enter any Integer : ");
	        number = sc.nextInt();
	        for (i = 2; i <number; i++)
	        {
	            if(number % i == 0)
	            {
	                count++;
	                break;
	            }
	        }
	        if(count == 0 && number != 1 )
	        {
	            System.out.println( number + " is a Prime Number");
	        }
	        else
	        {
	            System.out.println(number + " is is Not Prime Number");
	      sc.close();
	        }
	        }
}
