// Creating Class with name Q6 indicating the purpose is to display the quotient and remainder of two numbers
import java.util.*;
class Q6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1");
        // Create a int variable number1 to store the first number
        int number1=sc.nextInt();
        System.out.println("Enter number 2");
        // Create a int variable number2 to store the second number
        int number2=sc.nextInt();
        // Create a int variable quotient to store the quotient of two numbers
        int quotient=number1/number2;
        // Create a int variable remainder to store the remainder of two numbers
        int remainder=number1%number2;
        // Display the quotient and remainder of two numbers
        System.out.println("The quotient is "+quotient+" and remainder is  "+remainder+" of two numbers "+number1+" and "+number2);
    }
}