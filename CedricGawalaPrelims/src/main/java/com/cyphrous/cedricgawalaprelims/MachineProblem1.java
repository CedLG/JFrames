package com.cyphrous.cedricgawalaprelims;
/**
 *
 * @author GAWALA, CEDRIC LOUIS
 */
import java.io.*;
import java.util.Scanner;
public class MachineProblem1 {
    public static void main(String[] args) throws FileNotFoundException {
	    Scanner console = new Scanner(System.in);
	    PrintWriter outFile = new PrintWriter ("C:\\Users\\Win10\\Desktop\\Result.txt");
		int n1;
		int n2;
		System.out.println("Enter a Integer: \n");
		n1=console.nextInt();
		System.out.println("Enter the Second Integer: \n");
		n2=console.nextInt();
		
		if (n1<n2){
		    for(int i=0; i<5; i++){
		        n1++;
		        outFile.println(n1);
		    }
		   outFile.println("\n");
		    for(int j=0; j<5; j++){
		        --n2;
		        outFile.println(n2);
		    }
                    outFile.close();
		}
		System.out.println("Program ends.. Check Result.txt for the results!");
	}
}
