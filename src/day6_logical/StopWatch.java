/*6. Simulate Stopwatch Program
a. Desc -> Write a Stopwatch Program for measuring the time that elapses between
the start and end clicks
b. I/P -> Start the Stopwatch and End the Stopwatch
c. Logic -> Measure the elapsed time between start and end
d. O/P -> Print the elapsed time.*/
package day6_logical;

import java.util.Scanner;

public class StopWatch {
public static void main(String[] args) {
	System.out.println("Enter any character and press Enter to start the stop watch");
	Scanner sc =new Scanner(System.in);
	char start=sc.next().charAt(0);
	long startch =System.currentTimeMillis();
	System.out.println("Enter any character and press Enter to stop the stop watch");
	Scanner sc1=new Scanner(System.in);
	char stopch=sc1.next().charAt(0);
	long stop =System.currentTimeMillis();
	float timeElapsed =(float)(stop-start)/1000;
	System.out.println("Time =" +timeElapsed + "Seconds");
}
}