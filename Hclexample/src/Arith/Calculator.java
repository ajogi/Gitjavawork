package Arith;

import java.util.InputMismatchException;
import java.util.Scanner;

//import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args) throws InputMismatchException   {





boolean flag = false;
do // do while is for many operations
{
    try
    {
    	Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1 and num2 : ");
        int num1 = sc. nextInt();
        int num2 = sc. nextInt();
        System.out.println("Enter sign : ");
        char sign = (char) sc. nextInt();
    }
    catch(ArithmeticException ex) // This will check for illegal inputs
    {
        System.out.println(ex.getMessage()); //Will print error message
    }

    char sign='\0';
    int num1=0;
    int num2=0;
	if(sign == '+')
    { // part of code where you will write the plus operation
        System.out.println(num1+num2);
    }
    if(sign == '-')
    {
        System.out.println(num1-num2);
    }
    if(sign == '*')
    {
        System.out.println(num1*num2);
    }
    if(sign == '/')
    {
        try
        {
            System.out.println(num1/num2);
        }
        catch(InputMismatchException me)// Check for divide by zero exception
        {
            System.out.println("Please give correct sign");
        }
    }

    if(sign == 'x') // to exit
    {
        flag = false;
    }

    else
    {
        System.out.println("Error : Unknown Operator\n");
    }

}
while(flag == true);
    }
}// flag will be true until user enters 'x' as the choice to exit.