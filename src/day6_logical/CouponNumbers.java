/*5. Coupon Numbers
a. Desc -> Given N distinct Coupon Numbers, how many random numbers do you
need to generate a distinct coupon number? This program simulates this random
process.
b. I/P -> N Distinct Coupon Number
c. Logic -> repeatedly choose a random number and check whether it's a new one.
d. O/P -> total random number needed to have all distinct numbers.
e. Functions => Write Class Static Functions to generate random numbers and to
process distinct coupons.*/
package day6_logical;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class CouponNumbers {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of coupons you want to generate: ");
        int n=sc.nextInt();
        int randomCount=1,randomNumber,reference=0,index=1;
        int coupons[]=new int[n];
        coupons[0]=  ThreadLocalRandom.current().nextInt(0, 10000);
        for(int i=0;index<n;i++)
        {
            randomNumber=ThreadLocalRandom.current().nextInt(0, 10000);
            randomCount++;
            for(int j=0;j<index;j++)
            {
                if(coupons[j]==randomNumber)
                {
                    reference=1;
                }
            }
            if(reference==0)
            {
                coupons[index]=randomNumber;
                index++;
            }
            reference=0;
        }
        System.out.println("Coupons generated are: ");
        for(int elements:coupons) {
            System.out.println( elements  );
sc.close();
}
}
	}