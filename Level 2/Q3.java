// Creating a class named Q3 indicating the purpose is to find the side of the square
import java.util.*;
class Q3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the perimeter of square");
        // Create a double variable perimeter to store the perimeter of the square
        double perimeter=sc.nextInt();
        // Create a double variable side to store the side of the square
        double side=perimeter/4.0;
        // Display the side of the square
        System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);
    }
}