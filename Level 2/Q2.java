// Creating Class with name Q2 indicating the purpose is to display the area of the triangle
import java.util.*;
class Q2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base of the triangle");
        // Create a double variable base to store the base of the triangle
        double base=sc.nextDouble();
        System.out.println("Enter height of the triangle");
        // Create a double variable height to store the height of the triangle
        double height=sc.nextDouble();
        // Create a double variable area to store the area of the triangle
        double area=(base*height)/2.0;
        // Display the area of the triangle
        System.out.println("Area of the triangle is "+area);
    }
}