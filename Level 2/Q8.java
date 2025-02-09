// Creating Class with name Q8 indicating the purpose is to display the results of DoubleOperations
import java.util.*;
class Q8
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        // Create a double variable a to store the first number
        double a=sc.nextDouble();
        System.out.println("Enter the value of b");
        // Create a double variable b to store the second number
        double b=sc.nextDouble();
        System.out.println("Enter the value of c");
        // Create a double variable c to store the third number
        double c=sc.nextDouble();
        // Create a double variable integeroperation1 to store the result of a + b * c
        double integeroperation1 = a + b * c;
        // Create a double variable integeroperation2 to store the result of a * b + c
        double integeroperation2 = a * b + c;
        // Create a double variable integeroperation3 to store the result of c + a / b
        double integeroperation3 = c + a / b;
        // Display the results of IntOperations
        System.out.println("The results of IntOperations are "+integeroperation1+" , "+integeroperation2+" and "+integeroperation3);
    }
}