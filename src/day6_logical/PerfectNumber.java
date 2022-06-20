/*Just like the Armstrong number, the Perfect Number is also a special type of
positive number. When the number is equal to the sum of its positive divisors
excluding the number, it is called a Perfect Number. For example, 28 is the perfect
number because when we sum the divisors of 28, it will result in the same number.
The divisors of 28 are 1, 2, 4, 7, and 14. So,
b. 28 = 1+2+4+7
c. 28 = 28*/
package day6_logical;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to check perfect number: ");//checking input from user
    int n = sc.nextInt();
    sc.close();
    int perfect = 0;
    for (int i = 1; i <= n / 2; i++) { //checking
       int k =n/i;
        System.out.println(k);
        if (n % i == 0) {
            perfect = perfect + i;

       }
    }
    if (perfect == n) {
        System.out.println(n + " is a perfect number.");
    } else {
        System.out.println(n + " is not a perfect number.");
}
}
}
