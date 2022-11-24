package com.cyphrous.cedricgawalaprelims;
/**
 *
 * @author GAWALA, CEDRIC LOUIS
 */
import java.io.*;
import java.util.Scanner;
public class MachineProblem2 {
    public static void main(String[] args) throws FileNotFoundException {
	    Scanner console = new Scanner(System.in);
	    PrintWriter outFile = new PrintWriter ("C:\\Users\\Win10\\Desktop\\Result2.txt");
            Scanner inFile = new Scanner(new FileReader("C:\\Users\\Win10\\Desktop\\Result2.txt"));
            
		int n1;
		int n2;
                
                int n3;
                int n4;
                int n5;
                int n6;
                int n7;
                int n8;
                int n9;
                int n10;
                int n11;
                int n12;
                
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
                
                n3=inFile.nextInt();
                n4=inFile.nextInt();
                n5=inFile.nextInt();
                n6=inFile.nextInt();
                n7=inFile.nextInt();
                n8=inFile.nextInt();
                n9=inFile.nextInt();
                n10=inFile.nextInt();
                n11=inFile.nextInt();
                n12=inFile.nextInt();
                System.out.println("Output: \n")  ;  
                System.out.println(n3);
                System.out.println(n4);
                System.out.println(n5);
                System.out.println(n6);
                System.out.println(n7);
                System.out.println("\n");
                System.out.println(n8);
                System.out.println(n9);
                System.out.println(n10);
                System.out.println(n11);
                System.out.println(n12);
                inFile.close();
	}    
}
