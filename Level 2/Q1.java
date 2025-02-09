// Creating Class with name Q1 indicating the purpose is to perform basic calculations
import java.util.*;
class Q1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1");
        // Create a float variable number1 to store the first number
        float number1=sc.nextFloat();
        System.out.println("Enter number 2");
        // Create a float variable number2 to store the second number
        float number2=sc.nextFloat();
        // Create a float variable addition to store the addition of number1 and number2
        float addition=number1+number2;
        // Create a float variable subtraction to store the subtraction of number1 and number2
        float subtraction=number1-number2;
        // Create a float variable multiplication to store the multiplication of number1 and number2
        float multiplication=number1*number2;
        // Create a float variable division to store the division of number1 and number2
        float division=number1/number2;
        // Display the addition,subtraction,multiplication and division value of 2 number
        System.out.println("The addition,subtraction,multiplication and division value of 2 number "+number1+" and "+number2+" is "+addition+" , "+subtraction+" , "+multiplication+" , "+division);
    }
}