/*Write a static function toBinary that outputs the binary (base 2) representation of
the decimal number typed as the input. It is based on decomposing the number into
a sum of powers of 2. For example, the binary representation of 106 is 11010102,
which is the same as saying that 106 = 64 + 32 + 8 + 2. Ensure necessary padding
to represent 4 Byte String.
To compute the binary representation of n, we consider the powers of 2 less than or
equal to n in decreasing order to determine which belong in the binary
decomposition (and therefore correspond to a 1 bit in the binary representation).*/
package junitprograms;

import java.util.Scanner;

public class ToBinary {
	 public static void main(String[] args) {
	        Scanner  input = new Scanner(System.in);
	        System.out.print("Please enter a decimal number: ");
	        int a = input.nextInt();     
	        input.close();  

	        int[] b = toBinary(a);
	        System.out.print("Binary value of "+a+" is ");
	        for(int i = 0;i <= b.length-1;i++){    
	            System.out.print(b[i]);    
	        } 
	    }

	    public static int[] toBinary(int decimal){    
	        int binary[] = new int[8];    
	        int index = 0;    
	        while(decimal > 0){    
	            binary[index++] = decimal%2;    
	            decimal = decimal/2;    
	        }    
	        
	        binary = reverseBinary(binary);

	        return binary;
	   }

	   public static int[] reverseBinary(int[] binary){
	        for(int i = 0; i < binary.length / 2; i++){
	            int temp = binary[i];
	            binary[i] = binary[binary.length - i - 1];
	            binary[binary.length - i - 1] = temp;
	        }
	        return binary;
	    }

}
