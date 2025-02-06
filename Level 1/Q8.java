// Creating Class with name Q8 indicating the purpose is to display the converted distance from km to miles entered by the user
import java.util.*;
class Q8
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter kilometer to convert it in miles");
        // Create a double variable km to store the distance in km from the user
        double km=input.nextDouble();
        // Create a double variable miles to store the distance in miles
        double miles=km/1.6;
        // Display the miles
        System.out.println("The total miles is "+miles+" for the given "+km+" km");
    }
}