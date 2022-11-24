package com.cyphrous.cedricgawalaprelims;

import java.io.*;
import java.util.Scanner;
/**
 *
 * @author GAWALA, CEDRIC LOUIS
 */
public class MachineProblem3 {
    public static void main(String[] args)throws FileNotFoundException{
        Scanner inFile = new Scanner(new FileReader("C:\\Users\\Win10\\Desktop\\Letters.txt"));
        
        int counter=0;
        String letters;
        letters=inFile.nextLine();
        for(int i = 0; i < letters.length(); i++)
        {
            char ch = letters.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                counter++;
        }
        inFile.close();
        PrintWriter outFile = new PrintWriter ("C:\\Users\\Win10\\Desktop\\Letters.txt");
        outFile.println(letters);
        outFile.println("\n"+"The UpperCase letter: "+counter);
        System.out.println("The UpperCase letter: "+counter);
        outFile.close();
        
        
    }
}
