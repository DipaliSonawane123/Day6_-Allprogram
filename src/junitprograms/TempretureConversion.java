/*To the Util Class add temperaturConversion static function, given the temperature
in fahrenheit as input outputs the temperature in Celsius or viceversa using the
formula
Celsius to Fahrenheit: (°C × 9/5) + 32 = °F
Fahrenheit to Celsius: (°F − 32) x 5/9 = °C*/
package junitprograms;

import java.util.Scanner;

public class TempretureConversion {
	 public static void main(String[] args) {

	        System.out.println("1. Fahrenheit to Celsius \n 2. Celsius to Fahrenheit");
	        System.out.print("Please select an option: ");
	        Scanner input = new Scanner(System.in);     
	        int option = input.nextInt();
	        switch(option) {
	        	case 1:
	            System.out.print("Enter the temperature in Fahrenheit to convert: ");
	            int temperature = input.nextInt();
	            double toCelsius = (temperature - 32) * 5/9; 
	            System.out.print(temperature + " degree Fahrenheit is equal to " + toCelsius + " degree Celsius.");
	            break;
	        	case 2:
	            System.out.print("Enter the temperature in Celsius to convert: ");
	            int temperature1 = input.nextInt();
	            double toFahrenheit = (temperature1 * 9/5) + 32;
	            System.out.print(temperature1 + " degree Celsius is equal to " + toFahrenheit + " degree Fahrenheit.");
	            
	            break;
	       default:
	            System.out.println("Invalid Selection.");
	        }
	        input.close();
	    }
	  
}
