// Creating Class with name Q10 indicating the purpose is to display your height in inches and feet
import java.util.*;
class Q10
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Height in cm");
        // Create a double variable heightcm to store the height of the user in cm
        double heightcm=sc.nextDouble();
        // Create a double variable heightinch to store the height of the user in inches
        double heightinch=heightcm/2.54;
        // Create a double variable heightfeet to store the height of the user in feet
        double heightfeet=heightinch/12.0;
        // Display the height in cm,inch and feet
        System.out.println("Your Height in cm is "+heightcm+" while in feet is "+heightfeet+" and inches is "+heightinch);
    }
}