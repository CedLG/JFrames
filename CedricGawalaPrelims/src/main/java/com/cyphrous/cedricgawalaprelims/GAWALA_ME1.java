package com.cyphrous.cedricgawalaprelims;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
/**
 *
 * @author Cedric Gawala
 */
public class GAWALA_ME1 {

    public static void main(String[] args) throws FileNotFoundException 
    {
        while(true)
        {
        menu();
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        n = scanner.nextInt();

        switch (n)
        {
            case 1:
                MachineExercise1();
                break;
            case 2:
                MachineExercise2();
                break;
            case 3:
                MachineExercise3();
                break;
            case 4:
                MachineExercise4();
                break;
            case 5:
                MachineExercise5();
                break;
            case 6:
                EmployeeIncome();
                break;
            case 7:
                addition();
                break;
            case 8:
                System.exit(0);
                break;
            default:
                break;
        }
        }
        
    }
        
        public static void addition()
        {
            Scanner addition = new Scanner(System.in); 
            System.out.println("Addition");
            System.out.println("Enter first number: ");
            int x = addition.nextInt();
            System.out.println("Enter second number: ");
            int y = addition.nextInt();
            int sum = x + y;
            System.out.println("The sum is: "+sum);
            
            
            
        }
        
    
        public static void MachineExercise1() {
        Scanner console = new Scanner(System.in); 
        
        int age;
        System.out.print("Enter age: ");
        age=console.nextInt();
        
        if (age>=0 && age<=4)
            System.out.println ("That person is a BABY.");
        
        if (age>=5 && age<=12)
            System.out.println ("That person is a CHILD.");
        
        if (age>=13 && age<=19)
            System.out.println ("That person is a TEEN.");
        
        if (age>=20)
            System.out.println ("That person is an ADULT.");
        
    }
    
     public static void MachineExercise2() {
        Scanner console = new Scanner(System.in); 
        
        int age;
        System.out.print("Enter age: ");
        age=console.nextInt();
        
        if (age==0 || age==1 || age==2 || age==3 || age==4)
            System.out.println ("That person is a BABY.");
        
        if (age==5 || age==6 || age==7 || age==8 || age==9 || age==10 || age==11 || age==12)
            System.out.println ("That persin is a CHILD.");
        
        if (age==13 || age==14 || age==15 || age==16 || age==17 || age==18 || age==9)
            System.out.println ("That persin is a TEEN.");
        
        if (age>=20)
            System.out.println ("That persin is an ADULT.");
        
        
    }
     
     public static void MachineExercise3() 
        {
            //This program will simply determine wether the number is odd or even
            int n;
            n=Integer.parseInt(JOptionPane.showInputDialog("Enter an integer value: "));
            if(n%2==0)
                JOptionPane.showMessageDialog(null,n+" is an Even number","Result",JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(null,n+" is an Odd number","Result",JOptionPane.INFORMATION_MESSAGE);
        }  
     
     public static void MachineExercise4()
    {
        String firstname, lastname;
        String fullname;
        
        firstname=JOptionPane.showInputDialog("Enter your firstname: ");
        lastname=JOptionPane.showInputDialog("Enter your last name: ");
       
        fullname = firstname+ " "+lastname;
        
        JOptionPane.showMessageDialog(null,"Hello, "+fullname+"\nHave a nice day!","Output",JOptionPane.INFORMATION_MESSAGE);
    }
     
     public static void MachineExercise5() throws FileNotFoundException{
        Scanner inFile = new Scanner (new FileReader ("C:\\Users\\Win10\\Desktop\\OOP\\Numbers.txt"));
        PrintWriter outFile = new PrintWriter ("C:\\Users\\Win10\\Desktop\\OOP\\prog.txt");
   
        int num, i;
        int even = 0, odd = 0;
        for (i=0; i < 5; i++){
            num = inFile.nextInt();
            if (num%2 == 0)
                even ++;
            else
                odd++;
            outFile.print(num+"\t");
        }
        outFile.println("\nEven Numbers: "+even);
        outFile.println("\nOdd Numbers: "+odd);
       
        System.out.println("Program end... check prog.txt for the results: ");
        inFile.close();
        outFile.close();

    }
     
     public static void EmployeeIncome()
    {
    Scanner console = new Scanner(System.in);
    int employeetype=0;
    System.out.println("Welcome to My LPU Employee Income!!!\n");
    System.out.println("Choose a Employee type: \n1. Part-time Employee\n2. Full-time Employee\n");
    employeetype=console.nextInt();
    
    switch (employeetype){
        case 1:
            double ptHourlyRate;
            double ptWorkHour;
            double PT_Income;
            System.out.println("Welcome Part-Time Employee of LPU Manila! \n");
            System.out.println("Enter Your Hourly Rate:\n");
            ptHourlyRate=console.nextDouble();
            System.out.println("Enter Your Hour Worked:\n");
            ptWorkHour=console.nextDouble();  
            PT_Income= ptHourlyRate*ptWorkHour;
            System.out.println("Your Hourly Rate Is:"+ptHourlyRate+"Your Work Hours is:"+ptWorkHour+"\n Your total income is:"+PT_Income+" PHP \n");
            break;
        case 2:
            double FT_RP=20000;
            double FT_OTH;
            double OverTime_Pay=0;
            double FT_Income;
            System.out.println("Welcome Regular Employee  of LPU Manila! \n");
            System.out.println("Enter Your Overtime Hour (enter 0 if none):\n");
            FT_OTH=console.nextDouble();
            if (FT_OTH>0)
                OverTime_Pay=156.25*FT_OTH;
                FT_Income= OverTime_Pay+FT_RP;
                System.out.println("Your Income Is: 20000PHP\n Your total income with Overtime Pay is:"+FT_Income+" PHP \n");

            break;
        default:
            break;
    }
          
     }

     public static void menu()
     {
        System.out.println("\n1. Machine Exercise 1");
        System.out.println("2. Machine Exercise 2");
        System.out.println("3. Machine Exercise 3");
        System.out.println("4. Machine Exercise 4");
        System.out.println("5. Machine Exercise 5");
        System.out.println("6. Employee Income");
        System.out.println("7. Addition");
        System.out.println("8. Exit");
        System.out.println("Please choose from 1-8: ");
     }
     
     
}
