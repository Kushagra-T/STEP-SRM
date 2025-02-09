// Creating Class with name Q7 indicating the purpose is to display the results of IntOperations
import java.util.*;
class Q7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        // Create a int variable a to store the first number
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        // Create a int variable b to store the second number
        int b=sc.nextInt();
        System.out.println("Enter the value of c");
        // Create a int variable c to store the third number
        int c=sc.nextInt();
        // Create a int variable integeroperation1 to store the result of a + b * c
        int integeroperation1 = a + b * c;
        // Create a int variable integeroperation2 to store the result of a * b + c
        int integeroperation2 = a * b + c;
        // Create a int variable integeroperation3 to store the result of c + a / b
        int integeroperation3 = c + a / b;
        // Display the results of IntOperations
        System.out.println("The results of IntOperations are "+integeroperation1+" , "+integeroperation2+" and "+integeroperation3);
    }
}